// java wrapper for vtk3DLinearGridPlaneCutter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtk3DLinearGridPlaneCutter extends vtkDataObjectAlgorithm
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

  private native void SetMergePoints_6(boolean id0);
  public void SetMergePoints(boolean id0)
  {
    SetMergePoints_6(id0);
  }

  private native boolean GetMergePoints_7();
  public boolean GetMergePoints()
  {
    return GetMergePoints_7();
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

  private native void SetComputeNormals_14(boolean id0);
  public void SetComputeNormals(boolean id0)
  {
    SetComputeNormals_14(id0);
  }

  private native boolean GetComputeNormals_15();
  public boolean GetComputeNormals()
  {
    return GetComputeNormals_15();
  }

  private native void ComputeNormalsOn_16();
  public void ComputeNormalsOn()
  {
    ComputeNormalsOn_16();
  }

  private native void ComputeNormalsOff_17();
  public void ComputeNormalsOff()
  {
    ComputeNormalsOff_17();
  }

  private native long GetMTime_18();
  public long GetMTime()
  {
    return GetMTime_18();
  }

  private native void SetOutputPointsPrecision_19(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_19(id0);
  }

  private native int GetOutputPointsPrecision_20();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_20();
  }

  private native void SetSequentialProcessing_21(boolean id0);
  public void SetSequentialProcessing(boolean id0)
  {
    SetSequentialProcessing_21(id0);
  }

  private native boolean GetSequentialProcessing_22();
  public boolean GetSequentialProcessing()
  {
    return GetSequentialProcessing_22();
  }

  private native void SequentialProcessingOn_23();
  public void SequentialProcessingOn()
  {
    SequentialProcessingOn_23();
  }

  private native void SequentialProcessingOff_24();
  public void SequentialProcessingOff()
  {
    SequentialProcessingOff_24();
  }

  private native int GetNumberOfThreadsUsed_25();
  public int GetNumberOfThreadsUsed()
  {
    return GetNumberOfThreadsUsed_25();
  }

  private native boolean GetLargeIds_26();
  public boolean GetLargeIds()
  {
    return GetLargeIds_26();
  }

  private native boolean CanFullyProcessDataObject_27(vtkDataObject id0);
  public boolean CanFullyProcessDataObject(vtkDataObject id0)
  {
    return CanFullyProcessDataObject_27(id0);
  }

  public vtk3DLinearGridPlaneCutter() { super(); }

  public vtk3DLinearGridPlaneCutter(long id) { super(id); }
  public native long   VTKInit();

}
