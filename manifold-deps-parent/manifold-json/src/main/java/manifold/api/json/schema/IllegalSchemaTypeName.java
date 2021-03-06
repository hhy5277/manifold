/*
 * Copyright (c) 2018 - Manifold Systems LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package manifold.api.json.schema;

import manifold.api.json.Token;

/**
 */
public class IllegalSchemaTypeName extends IllegalArgumentException
{
  private final String _typeName;
  private Token _token;

  IllegalSchemaTypeName( String typeName, Token token )
  {
    super( "Unrecognized type: " + typeName );
    _typeName = typeName;
    _token = token;
  }

  public String getTypeName()
  {
    return _typeName;
  }

  public Token getToken()
  {
    return _token;
  }
}
