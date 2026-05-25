// java wrapper for vtkEllipsoidalGaussianKernel object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkEllipsoidalGaussianKernel extends vtkGeneralizedKernel
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

  private native void Initialize_4(vtkAbstractPointLocator id0,vtkDataSet id1,vtkPointData id2);
  public void Initialize(vtkAbstractPointLocator id0,vtkDataSet id1,vtkPointData id2)
  {
    Initialize_4(id0,id1,id2);
  }

  private native long ComputeWeights_5(double id0[],vtkIdList id1,vtkDoubleArray id2,vtkDoubleArray id3);
  public long ComputeWeights(double id0[],vtkIdList id1,vtkDoubleArray id2,vtkDoubleArray id3)
  {
    return ComputeWeights_5(id0,id1,id2,id3);
  }

  private native void SetUseNormals_6(boolean id0);
  public void SetUseNormals(boolean id0)
  {
    SetUseNormals_6(id0);
  }

  private native boolean GetUseNormals_7();
  public boolean GetUseNormals()
  {
    return GetUseNormals_7();
  }

  private native void UseNormalsOn_8();
  public void UseNormalsOn()
  {
    UseNormalsOn_8();
  }

  private native void UseNormalsOff_9();
  public void UseNormalsOff()
  {
    UseNormalsOff_9();
  }

  private native void SetNormalsArrayName_10(byte[] id0, int len0);
  public void SetNormalsArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetNormalsArrayName_10(bytes0, bytes0.length);
  }

  private native byte[] GetNormalsArrayName_11();
  public String GetNormalsArrayName()
  {
    return new String(GetNormalsArrayName_11(), StandardCharsets.UTF_8);
  }

  private native void SetUseScalars_12(boolean id0);
  public void SetUseScalars(boolean id0)
  {
    SetUseScalars_12(id0);
  }

  private native boolean GetUseScalars_13();
  public boolean GetUseScalars()
  {
    return GetUseScalars_13();
  }

  private native void UseScalarsOn_14();
  public void UseScalarsOn()
  {
    UseScalarsOn_14();
  }

  private native void UseScalarsOff_15();
  public void UseScalarsOff()
  {
    UseScalarsOff_15();
  }

  private native void SetScalarsArrayName_16(byte[] id0, int len0);
  public void SetScalarsArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetScalarsArrayName_16(bytes0, bytes0.length);
  }

  private native byte[] GetScalarsArrayName_17();
  public String GetScalarsArrayName()
  {
    return new String(GetScalarsArrayName_17(), StandardCharsets.UTF_8);
  }

  private native void SetScaleFactor_18(double id0);
  public void SetScaleFactor(double id0)
  {
    SetScaleFactor_18(id0);
  }

  private native double GetScaleFactorMinValue_19();
  public double GetScaleFactorMinValue()
  {
    return GetScaleFactorMinValue_19();
  }

  private native double GetScaleFactorMaxValue_20();
  public double GetScaleFactorMaxValue()
  {
    return GetScaleFactorMaxValue_20();
  }

  private native double GetScaleFactor_21();
  public double GetScaleFactor()
  {
    return GetScaleFactor_21();
  }

  private native void SetSharpness_22(double id0);
  public void SetSharpness(double id0)
  {
    SetSharpness_22(id0);
  }

  private native double GetSharpnessMinValue_23();
  public double GetSharpnessMinValue()
  {
    return GetSharpnessMinValue_23();
  }

  private native double GetSharpnessMaxValue_24();
  public double GetSharpnessMaxValue()
  {
    return GetSharpnessMaxValue_24();
  }

  private native double GetSharpness_25();
  public double GetSharpness()
  {
    return GetSharpness_25();
  }

  private native void SetEccentricity_26(double id0);
  public void SetEccentricity(double id0)
  {
    SetEccentricity_26(id0);
  }

  private native double GetEccentricityMinValue_27();
  public double GetEccentricityMinValue()
  {
    return GetEccentricityMinValue_27();
  }

  private native double GetEccentricityMaxValue_28();
  public double GetEccentricityMaxValue()
  {
    return GetEccentricityMaxValue_28();
  }

  private native double GetEccentricity_29();
  public double GetEccentricity()
  {
    return GetEccentricity_29();
  }

  private native long ComputeWeights_30(double id0[],vtkIdList id1,vtkDoubleArray id2);
  public long ComputeWeights(double id0[],vtkIdList id1,vtkDoubleArray id2)
  {
    return ComputeWeights_30(id0,id1,id2);
  }

  public vtkEllipsoidalGaussianKernel() { super(); }

  public vtkEllipsoidalGaussianKernel(long id) { super(id); }
  public native long   VTKInit();

}
