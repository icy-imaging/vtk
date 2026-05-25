// java wrapper for vtkPointSource object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointSource extends vtkPolyDataAlgorithm
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

  private native void SetNumberOfPoints_4(long id0);
  public void SetNumberOfPoints(long id0)
  {
    SetNumberOfPoints_4(id0);
  }

  private native long GetNumberOfPointsMinValue_5();
  public long GetNumberOfPointsMinValue()
  {
    return GetNumberOfPointsMinValue_5();
  }

  private native long GetNumberOfPointsMaxValue_6();
  public long GetNumberOfPointsMaxValue()
  {
    return GetNumberOfPointsMaxValue_6();
  }

  private native long GetNumberOfPoints_7();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_7();
  }

  private native void SetCenter_8(double id0,double id1,double id2);
  public void SetCenter(double id0,double id1,double id2)
  {
    SetCenter_8(id0,id1,id2);
  }

  private native void SetCenter_9(double id0[]);
  public void SetCenter(double id0[])
  {
    SetCenter_9(id0);
  }

  private native double[] GetCenter_10();
  public double[] GetCenter()
  {
    return GetCenter_10();
  }

  private native void SetRadius_11(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_11(id0);
  }

  private native double GetRadiusMinValue_12();
  public double GetRadiusMinValue()
  {
    return GetRadiusMinValue_12();
  }

  private native double GetRadiusMaxValue_13();
  public double GetRadiusMaxValue()
  {
    return GetRadiusMaxValue_13();
  }

  private native double GetRadius_14();
  public double GetRadius()
  {
    return GetRadius_14();
  }

  private native void SetDistribution_15(int id0);
  public void SetDistribution(int id0)
  {
    SetDistribution_15(id0);
  }

  private native int GetDistributionMinValue_16();
  public int GetDistributionMinValue()
  {
    return GetDistributionMinValue_16();
  }

  private native int GetDistributionMaxValue_17();
  public int GetDistributionMaxValue()
  {
    return GetDistributionMaxValue_17();
  }

  private native void SetDistributionToShell_18();
  public void SetDistributionToShell()
  {
    SetDistributionToShell_18();
  }

  private native void SetDistributionToUniform_19();
  public void SetDistributionToUniform()
  {
    SetDistributionToUniform_19();
  }

  private native void SetDistributionToExponential_20();
  public void SetDistributionToExponential()
  {
    SetDistributionToExponential_20();
  }

  private native int GetDistribution_21();
  public int GetDistribution()
  {
    return GetDistribution_21();
  }

  private native void SetLambda_22(double id0);
  public void SetLambda(double id0)
  {
    SetLambda_22(id0);
  }

  private native double GetLambda_23();
  public double GetLambda()
  {
    return GetLambda_23();
  }

  private native void SetOutputPointsPrecision_24(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_24(id0);
  }

  private native int GetOutputPointsPrecision_25();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_25();
  }

  private native void SetRandomSequence_26(vtkRandomSequence id0);
  public void SetRandomSequence(vtkRandomSequence id0)
  {
    SetRandomSequence_26(id0);
  }

  private native long GetRandomSequence_27();
  public vtkRandomSequence GetRandomSequence()
  {
    long temp = GetRandomSequence_27();

    if (temp == 0) return null;
    return (vtkRandomSequence)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPointSource() { super(); }

  public vtkPointSource(long id) { super(id); }
  public native long   VTKInit();

}
