// java wrapper for vtkAppendFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAppendFilter extends vtkUnstructuredGridAlgorithm
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

  private native long GetInput_4(int id0);
  public vtkDataSet GetInput(int id0)
  {
    long temp = GetInput_4(id0);

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetInput_5();
  public vtkDataSet GetInput()
  {
    long temp = GetInput_5();

    if (temp == 0) return null;
    return (vtkDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetMergePoints_6();
  public int GetMergePoints()
  {
    return GetMergePoints_6();
  }

  private native void SetMergePoints_7(int id0);
  public void SetMergePoints(int id0)
  {
    SetMergePoints_7(id0);
  }

  private native void MergePointsOn_8();
  public void MergePointsOn()
  {
    MergePointsOn_8();
  }

  private native void MergePointsOff_9();
  public void MergePointsOff()
  {
    MergePointsOff_9();
  }

  private native void SetTolerance_10(double id0);
  public void SetTolerance(double id0)
  {
    SetTolerance_10(id0);
  }

  private native double GetToleranceMinValue_11();
  public double GetToleranceMinValue()
  {
    return GetToleranceMinValue_11();
  }

  private native double GetToleranceMaxValue_12();
  public double GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_12();
  }

  private native double GetTolerance_13();
  public double GetTolerance()
  {
    return GetTolerance_13();
  }

  private native void SetToleranceIsAbsolute_14(boolean id0);
  public void SetToleranceIsAbsolute(boolean id0)
  {
    SetToleranceIsAbsolute_14(id0);
  }

  private native boolean GetToleranceIsAbsolute_15();
  public boolean GetToleranceIsAbsolute()
  {
    return GetToleranceIsAbsolute_15();
  }

  private native void ToleranceIsAbsoluteOn_16();
  public void ToleranceIsAbsoluteOn()
  {
    ToleranceIsAbsoluteOn_16();
  }

  private native void ToleranceIsAbsoluteOff_17();
  public void ToleranceIsAbsoluteOff()
  {
    ToleranceIsAbsoluteOff_17();
  }

  private native void RemoveInputData_18(vtkDataSet id0);
  public void RemoveInputData(vtkDataSet id0)
  {
    RemoveInputData_18(id0);
  }

  private native long GetInputList_19();
  public vtkDataSetCollection GetInputList()
  {
    long temp = GetInputList_19();

    if (temp == 0) return null;
    return (vtkDataSetCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutputPointsPrecision_20(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_20(id0);
  }

  private native int GetOutputPointsPrecisionMinValue_21();
  public int GetOutputPointsPrecisionMinValue()
  {
    return GetOutputPointsPrecisionMinValue_21();
  }

  private native int GetOutputPointsPrecisionMaxValue_22();
  public int GetOutputPointsPrecisionMaxValue()
  {
    return GetOutputPointsPrecisionMaxValue_22();
  }

  private native int GetOutputPointsPrecision_23();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_23();
  }

  public vtkAppendFilter() { super(); }

  public vtkAppendFilter(long id) { super(id); }
  public native long   VTKInit();

}
