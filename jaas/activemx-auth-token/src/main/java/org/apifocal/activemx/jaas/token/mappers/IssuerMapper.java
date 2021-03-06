/*
 * Copyright (c) 2017-2018 apifocal LLC. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apifocal.activemx.jaas.token.mappers;

import com.nimbusds.jwt.JWTClaimsSet;
import org.apifocal.activemx.jaas.token.ClaimMapper;
import org.apifocal.activemx.jaas.token.Settings;

import java.security.Principal;
import java.util.Collections;
import java.util.Set;

/**
 * Mapper of issuer claim from token.
 */
public class IssuerMapper implements ClaimMapper {

    public IssuerMapper(Settings settings) {

    }

    @Override
    public Set<Principal> map(JWTClaimsSet claimsSet) {
        return Collections.singleton(new IssuerPrincipal(claimsSet.getIssuer()));
    }

}
