/*
 * This file was automatically generated by EvoSuite
 * Sat Feb 29 19:30:55 GMT 2020
 */

package org.apache.ibatis.datasource;

import org.junit.Test;
import static org.junit.Assert.*;
import org.apache.ibatis.datasource.DataSourceException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DataSourceException_ESTest extends DataSourceException_ESTest_scaffolding {

  /**
   * COMPREENSÍVEL: Sim
   * DE FÁCIL CRIAÇÃO: Sim
   * IMPORTANTE PARA O CONTEXTO: Sim
   * ----------------------------------------------------------
   * DESCRIÇÃO: O teste em questão verifica se a classe DataSourceException
   * prepara a exceção corretamente a depender se é uma exceção padrão
   * ou com mensagem personalizada.
   * ----------------------------------------------------------
  */
  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DataSourceException dataSourceException0 = new DataSourceException();
      DataSourceException dataSourceException1 = new DataSourceException("Y<zH\"", dataSourceException0);
      assertFalse(dataSourceException1.equals((Object)dataSourceException0));
  }

  /**
   * COMPREENSÍVEL: Sim
   * DE FÁCIL CRIAÇÃO: Sim
   * IMPORTANTE PARA O CONTEXTO: Não
   * ----------------------------------------------------------
   * DESCRIÇÃO: O teste em questão verifica se a classe DataSourceException
   * prepara a exceção corretamente, porém aparentemente nenhuma verificação
   * adicional é efetuada.
   * ----------------------------------------------------------
  */
  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DataSourceException dataSourceException0 = new DataSourceException("");
  }

  /**
   * COMPREENSÍVEL: Sim
   * DE FÁCIL CRIAÇÃO: Sim
   * IMPORTANTE PARA O CONTEXTO: Sim
   * ----------------------------------------------------------
   * DESCRIÇÃO: O teste em questão verifica se a classe DataSourceException
   * prepara a exceção corretamente a depender se é uma exceção padrão
   * ou com mensagem personalizada.
   * ----------------------------------------------------------
  */
  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DataSourceException dataSourceException0 = new DataSourceException();
      DataSourceException dataSourceException1 = new DataSourceException(dataSourceException0);
      assertFalse(dataSourceException1.equals((Object)dataSourceException0));
  }
}
