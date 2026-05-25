// java wrapper for vtkPolyDataPlaneCutter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolyDataPlaneCutter extends vtkPolyDataAlgorithm
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

  private native void SetPlane_4(vtkPlane id0);
  public void SetPlane(vtkPlane id0)
  {
    SetPlane_4(id0);
  }

  private native long GetPlane_5();
  public vtkPlane GetPlane()
  {
    long temp = GetPlane_5();

    if (temp == 0) return null;
    return (vtkPlane)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetComputeNormals_6(boolean id0);
  public void SetComputeNormals(boolean id0)
  {
    SetComputeNormals_6(id0);
  }

  private native boolean GetComputeNormals_7();
  public boolean GetComputeNormals()
  {
    return GetComputeNormals_7();
  }

  private native void ComputeNormalsOn_8();
  public void ComputeNormalsOn()
  {
    ComputeNormalsOn_8();
  }

  private native void ComputeNormalsOff_9();
  public void ComputeNormalsOff()
  {
    ComputeNormalsOff_9();
  }

  private native void SetInterpolateAttributes_10(boolean id0);
  public void SetInterpolateAttributes(boolean id0)
  {
    SetInterpolateAttributes_10(id0);
  }

  private native boolean GetInterpolateAttributes_11();
  public boolean GetInterpolateAttributes()
  {
    return GetInterpolateAttributes_11();
  }

  private native void InterpolateAttributesOn_12();
  public void InterpolateAttributesOn()
  {
    InterpolateAttributesOn_12();
  }

  private native void InterpolateAttributesOff_13();
  public void InterpolateAttributesOff()
  {
    InterpolateAttributesOff_13();
  }

  private native void SetOutputPointsPrecision_14(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_14(id0);
  }

  private native int GetOutputPointsPrecision_15();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_15();
  }

  private native long GetMTime_16();
  public long GetMTime()
  {
    return GetMTime_16();
  }

  private native void SetBatchSize_17(int id0);
  public void SetBatchSize(int id0)
  {
    SetBatchSize_17(id0);
  }

  private native int GetBatchSizeMinValue_18();
  public int GetBatchSizeMinValue()
  {
    return GetBatchSizeMinValue_18();
  }

  private native int GetBatchSizeMaxValue_19();
  public int GetBatchSizeMaxValue()
  {
    return GetBatchSizeMaxValue_19();
  }

  private native int GetBatchSize_20();
  public int GetBatchSize()
  {
    return GetBatchSize_20();
  }

  private native boolean CanFullyProcessDataObject_21(vtkDataObject id0);
  public boolean CanFullyProcessDataObject(vtkDataObject id0)
  {
    return CanFullyProcessDataObject_21(id0);
  }

  public vtkPolyDataPlaneCutter() { super(); }

  public vtkPolyDataPlaneCutter(long id) { super(id); }
  public native long   VTKInit();

}
