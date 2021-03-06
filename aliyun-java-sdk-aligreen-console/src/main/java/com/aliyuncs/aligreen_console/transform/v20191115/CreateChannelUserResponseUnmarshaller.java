/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.aligreen_console.transform.v20191115;

import com.aliyuncs.aligreen_console.model.v20191115.CreateChannelUserResponse;
import com.aliyuncs.aligreen_console.model.v20191115.CreateChannelUserResponse.ChannelInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class CreateChannelUserResponseUnmarshaller {

	public static CreateChannelUserResponse unmarshall(CreateChannelUserResponse createChannelUserResponse, UnmarshallerContext _ctx) {
		
		createChannelUserResponse.setRequestId(_ctx.stringValue("CreateChannelUserResponse.RequestId"));
		createChannelUserResponse.setUid(_ctx.stringValue("CreateChannelUserResponse.Uid"));
		createChannelUserResponse.setNotes(_ctx.stringValue("CreateChannelUserResponse.Notes"));
		createChannelUserResponse.setAligreenUid(_ctx.stringValue("CreateChannelUserResponse.AligreenUid"));

		ChannelInfo channelInfo = new ChannelInfo();
		channelInfo.setName(_ctx.stringValue("CreateChannelUserResponse.ChannelInfo.Name"));
		channelInfo.setOwners(_ctx.stringValue("CreateChannelUserResponse.ChannelInfo.Owners"));
		channelInfo.setNotes(_ctx.stringValue("CreateChannelUserResponse.ChannelInfo.Notes"));
		channelInfo.setChannel(_ctx.stringValue("CreateChannelUserResponse.ChannelInfo.Channel"));
		createChannelUserResponse.setChannelInfo(channelInfo);
	 
	 	return createChannelUserResponse;
	}
}