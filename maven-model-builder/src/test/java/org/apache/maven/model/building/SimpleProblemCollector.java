package org.apache.maven.model.building;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * A simple model problem collector for testing the model building components.
 * 
 * @author Benjamin Bentmann
 */
public class SimpleProblemCollector
    implements ModelProblemCollector
{

    private List<String> warnings = new ArrayList<String>();

    private List<String> errors = new ArrayList<String>();

    public void addError( String message )
    {
        errors.add( message );
    }

    public void addError( String message, Exception cause )
    {
        addError( message );
    }

    public void addWarning( String message )
    {
        warnings.add( message );
    }

    public void addWarning( String message, Exception cause )
    {
        addWarning( message );
    }

    public List<String> getWarnings()
    {
        return warnings;
    }

    public List<String> getErrors()
    {
        return errors;
    }

}
