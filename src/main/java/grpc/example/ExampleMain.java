package grpc.example;

import adamant.global.v1.ListWalletsByFilterRequest;
import adamant.global.v1.ListWalletsRequest;
import adamant.global.v1.ListWalletsResponse;
import adamant.teller.v1.TellerAPIGrpc;
import gincoinc.global.v1.Enum;
import io.github.cdimascio.dotenv.Dotenv;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExampleMain {
    public static final Logger logger = Logger.getLogger(ExampleMain.class.getName());

    public static void main(String[] args) throws Exception {
        logger.info("building client");

        Dotenv dotenv = Dotenv.load();

        String target = dotenv.get("TARGET_HOST");

        ManagedChannel channel = ManagedChannelBuilder
                .forTarget(target)
                .useTransportSecurity()
                .build();
        try {
            logger.info("trying to call some api");
            TellerAPIGrpc.TellerAPIBlockingStub blockingStub = TellerAPIGrpc.newBlockingStub(channel);

            ListWalletsRequest request = ListWalletsRequest
                    .newBuilder()
                    .setPageSize(3)
                    .build();
            ListWalletsResponse response = blockingStub.listWallets(request);

            logger.info("Request result: " + response.getWalletsList().toString());

        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed {0}", e.getStatus());
            return;
        } catch (Exception e) {
            logger.log(Level.WARNING, "RPC failed {0}", e);
            return;
        } finally {
            channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
        }
        logger.info("calling api succeeded");
    }
}
