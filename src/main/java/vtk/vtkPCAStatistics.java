// java wrapper for vtkPCAStatistics object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPCAStatistics extends vtkMultiCorrelativeStatistics
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetNormalizationScheme_4(int id0);
  public void SetNormalizationScheme(int id0)
  {
    SetNormalizationScheme_4(id0);
  }

  private native int GetNormalizationScheme_5();
  public int GetNormalizationScheme()
  {
    return GetNormalizationScheme_5();
  }

  private native void SetNormalizationSchemeByName_6(byte[] id0, int len0);
  public void SetNormalizationSchemeByName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNormalizationSchemeByName_6(bytes0, bytes0.length);
  }

  private native byte[] GetNormalizationSchemeName_7(int id0);
  public String GetNormalizationSchemeName(int id0)
  {
    return new String(GetNormalizationSchemeName_7(id0), StandardCharsets.UTF_8);
  }

  private native long GetSpecifiedNormalization_8();
  public vtkTable GetSpecifiedNormalization()
  {
    long temp = GetSpecifiedNormalization_8();

    if (temp == 0) return null;
    return (vtkTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSpecifiedNormalization_9(vtkTable id0);
  public void SetSpecifiedNormalization(vtkTable id0)
  {
    SetSpecifiedNormalization_9(id0);
  }

  private native void GetEigenvalues_10(int id0,vtkDoubleArray id1);
  public void GetEigenvalues(int id0,vtkDoubleArray id1)
  {
    GetEigenvalues_10(id0,id1);
  }

  private native void GetEigenvalues_11(vtkDoubleArray id0);
  public void GetEigenvalues(vtkDoubleArray id0)
  {
    GetEigenvalues_11(id0);
  }

  private native double GetEigenvalue_12(int id0,int id1);
  public double GetEigenvalue(int id0,int id1)
  {
    return GetEigenvalue_12(id0,id1);
  }

  private native double GetEigenvalue_13(int id0);
  public double GetEigenvalue(int id0)
  {
    return GetEigenvalue_13(id0);
  }

  private native void GetEigenvectors_14(int id0,vtkDoubleArray id1);
  public void GetEigenvectors(int id0,vtkDoubleArray id1)
  {
    GetEigenvectors_14(id0,id1);
  }

  private native void GetEigenvectors_15(vtkDoubleArray id0);
  public void GetEigenvectors(vtkDoubleArray id0)
  {
    GetEigenvectors_15(id0);
  }

  private native void GetEigenvector_16(int id0,vtkDoubleArray id1);
  public void GetEigenvector(int id0,vtkDoubleArray id1)
  {
    GetEigenvector_16(id0,id1);
  }

  private native void GetEigenvector_17(int id0,int id1,vtkDoubleArray id2);
  public void GetEigenvector(int id0,int id1,vtkDoubleArray id2)
  {
    GetEigenvector_17(id0,id1,id2);
  }

  private native void SetBasisScheme_18(int id0);
  public void SetBasisScheme(int id0)
  {
    SetBasisScheme_18(id0);
  }

  private native int GetBasisScheme_19();
  public int GetBasisScheme()
  {
    return GetBasisScheme_19();
  }

  private native byte[] GetBasisSchemeName_20(int id0);
  public String GetBasisSchemeName(int id0)
  {
    return new String(GetBasisSchemeName_20(id0), StandardCharsets.UTF_8);
  }

  private native void SetBasisSchemeByName_21(byte[] id0, int len0);
  public void SetBasisSchemeByName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetBasisSchemeByName_21(bytes0, bytes0.length);
  }

  private native void SetFixedBasisSize_22(int id0);
  public void SetFixedBasisSize(int id0)
  {
    SetFixedBasisSize_22(id0);
  }

  private native int GetFixedBasisSize_23();
  public int GetFixedBasisSize()
  {
    return GetFixedBasisSize_23();
  }

  private native void SetFixedBasisEnergy_24(double id0);
  public void SetFixedBasisEnergy(double id0)
  {
    SetFixedBasisEnergy_24(id0);
  }

  private native double GetFixedBasisEnergyMinValue_25();
  public double GetFixedBasisEnergyMinValue()
  {
    return GetFixedBasisEnergyMinValue_25();
  }

  private native double GetFixedBasisEnergyMaxValue_26();
  public double GetFixedBasisEnergyMaxValue()
  {
    return GetFixedBasisEnergyMaxValue_26();
  }

  private native double GetFixedBasisEnergy_27();
  public double GetFixedBasisEnergy()
  {
    return GetFixedBasisEnergy_27();
  }

  public vtkPCAStatistics() { super(); }

  public vtkPCAStatistics(long id) { super(id); }
  public native long   VTKInit();

}
