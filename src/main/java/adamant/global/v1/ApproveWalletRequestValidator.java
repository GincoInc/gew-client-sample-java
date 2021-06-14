// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
* Validates {@code ApproveWalletRequest} protobuf objects.
*/
public class ApproveWalletRequestValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.ApproveWalletRequest>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.ApproveWalletRequest.class)) return new ApproveWalletRequestValidator();
		
		return null;
	}
		
		com.google.re2j.Pattern WALLET_ID__PATTERN = com.google.re2j.Pattern.compile("^[0-9a-f]{8}-[0-9a-f]{4}-4[0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$");
	
	

	public void assertValid(adamant.global.v1.ApproveWalletRequest proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.StringValidation.pattern(".adamant.global.v1.ApproveWalletRequest.wallet_id", proto.getWalletId(), WALLET_ID__PATTERN);
	
	}

}

