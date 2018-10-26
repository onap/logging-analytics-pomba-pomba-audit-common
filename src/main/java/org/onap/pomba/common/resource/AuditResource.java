/*
 * ============LICENSE_START===================================================
 * Copyright (c) 2018 Amdocs
 * ============================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END=====================================================
 */

package org.onap.pomba.common.resource;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiParam;
import org.onap.pomba.common.datatypes.ModelContext;

import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Api
@Path("/service")
@Produces({MediaType.APPLICATION_JSON})
public class AuditResource {


    @GET
    @Path("/context")
    @Produces({ MediaType.APPLICATION_JSON })
    @ApiOperation(
            value = "Get Common model context from Context Builder",
            response = ModelContext.class)
    @ApiResponses(value = {
            @ApiResponse(code = 404, message = "Service not available"),
            @ApiResponse(code = 400, message = "Bad request"),
            @ApiResponse(code = 401, message = "Unauthorized"),
            @ApiResponse(code = 500, message = "Unexpected Runtime error") })

    public  ModelContext getContext(
            @ApiParam(value = "ID that identifies calling application", required = true) @HeaderParam("X-FromAppId") String xFromAppId,
            @ApiParam(value = "Transaction ID published by the calling application", required = false) @HeaderParam("X-TransactionId") String xTransactionId,
            @ApiParam(value = "Instance ID of the audited service", required = true) @QueryParam("serviceInstanceId") String serviceInstanceId,
            @ApiParam(value = "Unique identifier of a SDC model version", required = false) @QueryParam("modelVersionId") String modelVersionId,
            @ApiParam(value = "Global identifier of each SDC asset", required = false) @QueryParam("modelInvariantId") String modelInvariantId
    )

    {
        return null;
    }


}
