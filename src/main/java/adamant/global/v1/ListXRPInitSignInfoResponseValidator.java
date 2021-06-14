// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
* Validates {@code ListXRPInitSignInfoResponse} protobuf objects.
*/
public class ListXRPInitSignInfoResponseValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.ListXRPInitSignInfoResponse>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.ListXRPInitSignInfoResponse.class)) return new ListXRPInitSignInfoResponseValidator();
		
		return null;
	}
		
	
	

	public void assertValid(adamant.global.v1.ListXRPInitSignInfoResponse proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	
			io.envoyproxy.pgv.RepeatedValidation.forEach(proto.getSignInfoListList(), item -> {
				
			// Validate sign_info_list
			if (true) index.validatorFor(item).assertValid(item);
			});

	
	}

}
