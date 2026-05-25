// java wrapper for vtkControlPointsItem object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkControlPointsItem extends vtkPlot
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

  private native void GetBounds_4(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_4(id0);
  }

  private native void SetUserBounds_5(double id0,double id1,double id2,double id3);
  public void SetUserBounds(double id0,double id1,double id2,double id3)
  {
    SetUserBounds_5(id0,id1,id2,id3);
  }

  private native void SetUserBounds_6(double id0[]);
  public void SetUserBounds(double id0[])
  {
    SetUserBounds_6(id0);
  }

  private native double[] GetUserBounds_7();
  public double[] GetUserBounds()
  {
    return GetUserBounds_7();
  }

  private native void SetValidBounds_8(double id0,double id1,double id2,double id3);
  public void SetValidBounds(double id0,double id1,double id2,double id3)
  {
    SetValidBounds_8(id0,id1,id2,id3);
  }

  private native void SetValidBounds_9(double id0[]);
  public void SetValidBounds(double id0[])
  {
    SetValidBounds_9(id0);
  }

  private native double[] GetValidBounds_10();
  public double[] GetValidBounds()
  {
    return GetValidBounds_10();
  }

  private native float GetScreenPointRadius_11();
  public float GetScreenPointRadius()
  {
    return GetScreenPointRadius_11();
  }

  private native void SetScreenPointRadius_12(float id0);
  public void SetScreenPointRadius(float id0)
  {
    SetScreenPointRadius_12(id0);
  }

  private native boolean GetDrawPoints_13();
  public boolean GetDrawPoints()
  {
    return GetDrawPoints_13();
  }

  private native void SetDrawPoints_14(boolean id0);
  public void SetDrawPoints(boolean id0)
  {
    SetDrawPoints_14(id0);
  }

  private native void DrawPointsOn_15();
  public void DrawPointsOn()
  {
    DrawPointsOn_15();
  }

  private native void DrawPointsOff_16();
  public void DrawPointsOff()
  {
    DrawPointsOff_16();
  }

  private native boolean Paint_17(vtkContext2D id0);
  public boolean Paint(vtkContext2D id0)
  {
    return Paint_17(id0);
  }

  private native void SelectPoint_18(long id0);
  public void SelectPoint(long id0)
  {
    SelectPoint_18(id0);
  }

  private native void SelectAllPoints_19();
  public void SelectAllPoints()
  {
    SelectAllPoints_19();
  }

  private native void DeselectPoint_20(long id0);
  public void DeselectPoint(long id0)
  {
    DeselectPoint_20(id0);
  }

  private native void DeselectAllPoints_21();
  public void DeselectAllPoints()
  {
    DeselectAllPoints_21();
  }

  private native void ToggleSelectPoint_22(long id0);
  public void ToggleSelectPoint(long id0)
  {
    ToggleSelectPoint_22(id0);
  }

  private native long GetNumberOfSelectedPoints_23();
  public long GetNumberOfSelectedPoints()
  {
    return GetNumberOfSelectedPoints_23();
  }

  private native void GetControlPointsIds_24(vtkIdTypeArray id0,boolean id1);
  public void GetControlPointsIds(vtkIdTypeArray id0,boolean id1)
  {
    GetControlPointsIds_24(id0,id1);
  }

  private native void SetStrokeMode_25(boolean id0);
  public void SetStrokeMode(boolean id0)
  {
    SetStrokeMode_25(id0);
  }

  private native boolean GetStrokeMode_26();
  public boolean GetStrokeMode()
  {
    return GetStrokeMode_26();
  }

  private native void SetSwitchPointsMode_27(boolean id0);
  public void SetSwitchPointsMode(boolean id0)
  {
    SetSwitchPointsMode_27(id0);
  }

  private native boolean GetSwitchPointsMode_28();
  public boolean GetSwitchPointsMode()
  {
    return GetSwitchPointsMode_28();
  }

  private native void SetEndPointsXMovable_29(boolean id0);
  public void SetEndPointsXMovable(boolean id0)
  {
    SetEndPointsXMovable_29(id0);
  }

  private native boolean GetEndPointsXMovable_30();
  public boolean GetEndPointsXMovable()
  {
    return GetEndPointsXMovable_30();
  }

  private native void SetEndPointsYMovable_31(boolean id0);
  public void SetEndPointsYMovable(boolean id0)
  {
    SetEndPointsYMovable_31(id0);
  }

  private native boolean GetEndPointsYMovable_32();
  public boolean GetEndPointsYMovable()
  {
    return GetEndPointsYMovable_32();
  }

  private native boolean GetEndPointsMovable_33();
  public boolean GetEndPointsMovable()
  {
    return GetEndPointsMovable_33();
  }

  private native void SetEndPointsRemovable_34(boolean id0);
  public void SetEndPointsRemovable(boolean id0)
  {
    SetEndPointsRemovable_34(id0);
  }

  private native boolean GetEndPointsRemovable_35();
  public boolean GetEndPointsRemovable()
  {
    return GetEndPointsRemovable_35();
  }

  private native void SetShowLabels_36(boolean id0);
  public void SetShowLabels(boolean id0)
  {
    SetShowLabels_36(id0);
  }

  private native boolean GetShowLabels_37();
  public boolean GetShowLabels()
  {
    return GetShowLabels_37();
  }

  private native void SetLabelFormat_38(byte[] id0, int len0);
  public void SetLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelFormat_38(bytes0, bytes0.length);
  }

  private native byte[] GetLabelFormat_39();
  public String GetLabelFormat()
  {
    return new String(GetLabelFormat_39(), StandardCharsets.UTF_8);
  }

  private native long RemovePoint_40(long id0);
  public long RemovePoint(long id0)
  {
    return RemovePoint_40(id0);
  }

  private native void RemoveCurrentPoint_41();
  public void RemoveCurrentPoint()
  {
    RemoveCurrentPoint_41();
  }

  private native long GetNumberOfPoints_42();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_42();
  }

  private native void SpreadPoints_43(float id0,vtkIdTypeArray id1);
  public void SpreadPoints(float id0,vtkIdTypeArray id1)
  {
    SpreadPoints_43(id0,id1);
  }

  private native void SpreadPoints_44(float id0,boolean id1);
  public void SpreadPoints(float id0,boolean id1)
  {
    SpreadPoints_44(id0,id1);
  }

  private native long GetCurrentPoint_45();
  public long GetCurrentPoint()
  {
    return GetCurrentPoint_45();
  }

  private native void SetCurrentPoint_46(long id0);
  public void SetCurrentPoint(long id0)
  {
    SetCurrentPoint_46(id0);
  }

  private native long GetSelectedPointPen_47();
  public vtkPen GetSelectedPointPen()
  {
    long temp = GetSelectedPointPen_47();

    if (temp == 0) return null;
    return (vtkPen)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedPointBrush_48();
  public vtkBrush GetSelectedPointBrush()
  {
    long temp = GetSelectedPointBrush_48();

    if (temp == 0) return null;
    return (vtkBrush)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean GetUseAddPointItem_49();
  public boolean GetUseAddPointItem()
  {
    return GetUseAddPointItem_49();
  }

  private native void SetUseAddPointItem_50(boolean id0);
  public void SetUseAddPointItem(boolean id0)
  {
    SetUseAddPointItem_50(id0);
  }

  private native void UseAddPointItemOn_51();
  public void UseAddPointItemOn()
  {
    UseAddPointItemOn_51();
  }

  private native void UseAddPointItemOff_52();
  public void UseAddPointItemOff()
  {
    UseAddPointItemOff_52();
  }

  private native long GetAddPointItem_53();
  public vtkPlot GetAddPointItem()
  {
    long temp = GetAddPointItem_53();

    if (temp == 0) return null;
    return (vtkPlot)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void ResetBounds_54();
  public void ResetBounds()
  {
    ResetBounds_54();
  }

  public vtkControlPointsItem() { super(); }

  public vtkControlPointsItem(long id) { super(id); }

}
