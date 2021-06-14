// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
* Validates {@code ListWalletBalanceSnapshotsResponse} protobuf objects.
*/
public class ListWalletBalanceSnapshotsResponseValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.ListWalletBalanceSnapshotsResponse>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.ListWalletBalanceSnapshotsResponse.class)) return new ListWalletBalanceSnapshotsResponseValidator();
		
		return null;
	}
		
	
	

	public void assertValid(adamant.global.v1.ListWalletBalanceSnapshotsResponse proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			// Validate wallet_balance_snapshot_map
			if (proto.hasWalletBalanceSnapshotMap()) index.validatorFor(proto.getWalletBalanceSnapshotMap()).assertValid(proto.getWalletBalanceSnapshotMap());
	
	}

}

