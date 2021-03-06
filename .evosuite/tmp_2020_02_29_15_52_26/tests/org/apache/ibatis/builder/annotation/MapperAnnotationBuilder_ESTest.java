/**
 *    Copyright 2009-2020 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 29 19:04:38 GMT 2020
 */

package org.apache.ibatis.builder.annotation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import org.apache.ibatis.builder.annotation.MapperAnnotationBuilder;
import org.apache.ibatis.builder.annotation.MethodResolver;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.submitted.result_handler.UserResultHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MapperAnnotationBuilder_ESTest extends MapperAnnotationBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      Class<UserResultHandler> class0 = UserResultHandler.class;
      MapperAnnotationBuilder mapperAnnotationBuilder0 = new MapperAnnotationBuilder(configuration0, class0);
      // Undeclared exception!
      try { 
        mapperAnnotationBuilder0.parseStatement((Method) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.ibatis.builder.annotation.MapperAnnotationBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Class<UserResultHandler> class0 = UserResultHandler.class;
      MapperAnnotationBuilder mapperAnnotationBuilder0 = null;
      try {
        mapperAnnotationBuilder0 = new MapperAnnotationBuilder((Configuration) null, class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.ibatis.builder.BaseBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      Class<Integer> class0 = Integer.class;
      MapperAnnotationBuilder mapperAnnotationBuilder0 = new MapperAnnotationBuilder(configuration0, class0);
      MethodResolver methodResolver0 = new MethodResolver(mapperAnnotationBuilder0, (Method) null);
      configuration0.addIncompleteMethod(methodResolver0);
      // Undeclared exception!
      try { 
        mapperAnnotationBuilder0.parse();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.ibatis.builder.annotation.MapperAnnotationBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      Class<Integer> class0 = Integer.class;
      MapperAnnotationBuilder mapperAnnotationBuilder0 = new MapperAnnotationBuilder(configuration0, class0);
      mapperAnnotationBuilder0.parse();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Configuration configuration0 = new Configuration();
      Class<Annotation> class0 = Annotation.class;
      MapperAnnotationBuilder mapperAnnotationBuilder0 = new MapperAnnotationBuilder(configuration0, class0);
      mapperAnnotationBuilder0.parse();
      mapperAnnotationBuilder0.parse();
  }
}
