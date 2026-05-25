// java wrapper for vtkPolyDataPlaneClipper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPolyDataPlaneClipper extends vtkPolyDataAlgorithm
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

  private native long GetMTime_4();
  public long GetMTime()
  {
    return GetMTime_4();
  }

  private native void SetPlane_5(vtkPlane id0);
  public void SetPlane(vtkPlane id0)
  {
    SetPlane_5(id0);
  }

  private native long GetPlane_6();
  public vtkPlane GetPlane()
  {
    long temp = GetPlane_6();

    if (temp == 0) return null;
    return (vtkPlane)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetClippingLoops_7(boolean id0);
  public void SetClippingLoops(boolean id0)
  {
    SetClippingLoops_7(id0);
  }

  private native boolean GetClippingLoops_8();
  public boolean GetClippingLoops()
  {
    return GetClippingLoops_8();
  }

  private native void ClippingLoopsOn_9();
  public void ClippingLoopsOn()
  {
    ClippingLoopsOn_9();
  }

  private native void ClippingLoopsOff_10();
  public void ClippingLoopsOff()
  {
    ClippingLoopsOff_10();
  }

  private native void SetCapping_11(boolean id0);
  public void SetCapping(boolean id0)
  {
    SetCapping_11(id0);
  }

  private native boolean GetCapping_12();
  public boolean GetCapping()
  {
    return GetCapping_12();
  }

  private native void CappingOn_13();
  public void CappingOn()
  {
    CappingOn_13();
  }

  private native void CappingOff_14();
  public void CappingOff()
  {
    CappingOff_14();
  }

  private native long GetCap_15();
  public vtkPolyData GetCap()
  {
    long temp = GetCap_15();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetPassCapPointData_16(boolean id0);
  public void SetPassCapPointData(boolean id0)
  {
    SetPassCapPointData_16(id0);
  }

  private native boolean GetPassCapPointData_17();
  public boolean GetPassCapPointData()
  {
    return GetPassCapPointData_17();
  }

  private native void PassCapPointDataOn_18();
  public void PassCapPointDataOn()
  {
    PassCapPointDataOn_18();
  }

  private native void PassCapPointDataOff_19();
  public void PassCapPointDataOff()
  {
    PassCapPointDataOff_19();
  }

  private native void SetOutputPointsPrecision_20(int id0);
  public void SetOutputPointsPrecision(int id0)
  {
    SetOutputPointsPrecision_20(id0);
  }

  private native int GetOutputPointsPrecision_21();
  public int GetOutputPointsPrecision()
  {
    return GetOutputPointsPrecision_21();
  }

  private native void SetBatchSize_22(int id0);
  public void SetBatchSize(int id0)
  {
    SetBatchSize_22(id0);
  }

  private native int GetBatchSizeMinValue_23();
  public int GetBatchSizeMinValue()
  {
    return GetBatchSizeMinValue_23();
  }

  private native int GetBatchSizeMaxValue_24();
  public int GetBatchSizeMaxValue()
  {
    return GetBatchSizeMaxValue_24();
  }

  private native int GetBatchSize_25();
  public int GetBatchSize()
  {
    return GetBatchSize_25();
  }

  private native boolean CanFullyProcessDataObject_26(vtkDataObject id0);
  public boolean CanFullyProcessDataObject(vtkDataObject id0)
  {
    return CanFullyProcessDataObject_26(id0);
  }

  public vtkPolyDataPlaneClipper() { super(); }

  public vtkPolyDataPlaneClipper(long id) { super(id); }
  public native long   VTKInit();

}
