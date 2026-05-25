// java wrapper for vtkContourWidget object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkContourWidget extends vtkAbstractWidget
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

  private native void SetEnabled_4(int id0);
  public void SetEnabled(int id0)
  {
    SetEnabled_4(id0);
  }

  private native void SetRepresentation_5(vtkContourRepresentation id0);
  public void SetRepresentation(vtkContourRepresentation id0)
  {
    SetRepresentation_5(id0);
  }

  private native long GetContourRepresentation_6();
  public vtkContourRepresentation GetContourRepresentation()
  {
    long temp = GetContourRepresentation_6();

    if (temp == 0) return null;
    return (vtkContourRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void CreateDefaultRepresentation_7();
  public void CreateDefaultRepresentation()
  {
    CreateDefaultRepresentation_7();
  }

  private native void CloseLoop_8();
  public void CloseLoop()
  {
    CloseLoop_8();
  }

  private native void SetWidgetState_9(int id0);
  public void SetWidgetState(int id0)
  {
    SetWidgetState_9(id0);
  }

  private native int GetWidgetState_10();
  public int GetWidgetState()
  {
    return GetWidgetState_10();
  }

  private native void SetAllowNodePicking_11(int id0);
  public void SetAllowNodePicking(int id0)
  {
    SetAllowNodePicking_11(id0);
  }

  private native int GetAllowNodePicking_12();
  public int GetAllowNodePicking()
  {
    return GetAllowNodePicking_12();
  }

  private native void AllowNodePickingOn_13();
  public void AllowNodePickingOn()
  {
    AllowNodePickingOn_13();
  }

  private native void AllowNodePickingOff_14();
  public void AllowNodePickingOff()
  {
    AllowNodePickingOff_14();
  }

  private native void SetFollowCursor_15(int id0);
  public void SetFollowCursor(int id0)
  {
    SetFollowCursor_15(id0);
  }

  private native int GetFollowCursor_16();
  public int GetFollowCursor()
  {
    return GetFollowCursor_16();
  }

  private native void FollowCursorOn_17();
  public void FollowCursorOn()
  {
    FollowCursorOn_17();
  }

  private native void FollowCursorOff_18();
  public void FollowCursorOff()
  {
    FollowCursorOff_18();
  }

  private native void SetContinuousDraw_19(int id0);
  public void SetContinuousDraw(int id0)
  {
    SetContinuousDraw_19(id0);
  }

  private native int GetContinuousDraw_20();
  public int GetContinuousDraw()
  {
    return GetContinuousDraw_20();
  }

  private native void ContinuousDrawOn_21();
  public void ContinuousDrawOn()
  {
    ContinuousDrawOn_21();
  }

  private native void ContinuousDrawOff_22();
  public void ContinuousDrawOff()
  {
    ContinuousDrawOff_22();
  }

  private native void Initialize_23(vtkPolyData id0,int id1,vtkIdList id2);
  public void Initialize(vtkPolyData id0,int id1,vtkIdList id2)
  {
    Initialize_23(id0,id1,id2);
  }

  private native void Initialize_24();
  public void Initialize()
  {
    Initialize_24();
  }

  public vtkContourWidget() { super(); }

  public vtkContourWidget(long id) { super(id); }
  public native long   VTKInit();

}
