// Code generated by protoc-gen-validate. DO NOT EDIT.
// source: gincoinc/adamant/global/v1/adamantglobalv1/global_api.proto

package adamant.global.v1;

/**
* Validates {@code ListBalanceSnapshotsRequest} protobuf objects.
*/
public class ListBalanceSnapshotsRequestValidator implements io.envoyproxy.pgv.ValidatorImpl<adamant.global.v1.ListBalanceSnapshotsRequest>{
	public static io.envoyproxy.pgv.ValidatorImpl validatorFor(Class clazz) {
		if (clazz.equals(adamant.global.v1.ListBalanceSnapshotsRequest.class)) return new ListBalanceSnapshotsRequestValidator();
		
		return null;
	}
		
	
		
	
		
	
	

	public void assertValid(adamant.global.v1.ListBalanceSnapshotsRequest proto, io.envoyproxy.pgv.ValidatorIndex index) throws io.envoyproxy.pgv.ValidationException {
	// no validation rules for WatchOnly

	
			// Validate start_time
			if (proto.hasStartTime()) index.validatorFor(proto.getStartTime()).assertValid(proto.getStartTime());
	
			// Validate end_time
			if (proto.hasEndTime()) index.validatorFor(proto.getEndTime()).assertValid(proto.getEndTime());
	
	}

}

