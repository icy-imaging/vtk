// java wrapper for vtkAppendDataSets object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAppendDataSets extends vtkPointSetAlgorithm
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

  private native boolean GetMergePoints_4();
  public boolean GetMergePoints()
  {
    return GetMergePoints_4();
  }

  private native void SetMergePoints_5(boolean id0);
  public void SetMergePoints(boolean id0)
  {
    SetMergePoints_5(id0);
  }

  private native void MergePointsOn_6();
  public void MergePointsOn()
  {
    MergePointsOn_6();
  }

  private native void MergePointsOff_7();
  public void MergePointsOff()
  {
    MergePointsOff_7();
  }

  private native void SetTolerance_8(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_8(id0);
  }

  private native double GetToleranceMinValue_9();
  public double GetToleranceMinValue()
  {
    return GetToleranceMinValue_9();
  }

  private native double GetToleranceMaxValue_10();
  public double GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_10();
  }

  private native double GetTolerance_11();
  public double GetTolerance()
  {
    return GetTolerance_11();
  }

  private native void SetToleranceIsAbsolute_12(boolean id0);
  public void SetToleranceIsAbsolute(boolean id0)
  {
    SetToleranceIsAbsolute_12(id0);
  }

  private native boolean GetToleranceIsAbsolute_13();
  public boolean GetToleranceIsAbsolute()
  {
    return GetToleranceIsAbsolute_13();
  }

  private native void ToleranceIsAbsoluteOn_14();
  public void ToleranceIsAbsoluteOn()
  {
    ToleranceIsAbsoluteOn_14();
  }

  private native void ToleranceIsAbsoluteOff_15();
  public void ToleranceIsAbsoluteOff()
  {
    ToleranceIsAbsoluteOff_15();
  }

  private native void SetOutputDataSetType_16(int id0);
  public void SetOutputDataSetType(int id0)
  {
    SetOutputDataSetType_16(id0);
  }

  private native int GetOutputDataSetType_17();
  public int GetOutputDataSetType()
  {
    return GetOutputDataSetType_17();
  }

  private native void SetOutputPointsPrecision_18(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_18(id0);
  }

  private native int GetOutputPointsPrecisionMinValue_19();
  public int GetOutputPointsPrecisionMinValue()
  {
    return GetOutputPointsPrecisionMinValue_19();
  }

  private native int GetOutputPointsPrecisionMaxValue_20();
  public int GetOutputPointsPrecisionMaxValue()
  {
    return GetOutputPointsPrecisionMaxValue_20();
  }

  private native int GetOutputPointsPrecision_21();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_21();
  }

  public vtkAppendDataSets() { super(); }

  public vtkAppendDataSets(long id) { super(id); }
  public native long   VTKInit();

}
