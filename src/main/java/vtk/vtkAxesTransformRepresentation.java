// java wrapper for vtkAxesTransformRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAxesTransformRepresentation extends vtkWidgetRepresentation
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

  private native long GetOriginRepresentation_4();
  public vtkHandleRepresentation GetOriginRepresentation()
  {
    long temp = GetOriginRepresentation_4();

    if (temp == 0) return null;
    return (vtkHandleRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectionRepresentation_5();
  public vtkHandleRepresentation GetSelectionRepresentation()
  {
    long temp = GetSelectionRepresentation_5();

    if (temp == 0) return null;
    return (vtkHandleRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetOriginWorldPosition_6(double id0[]);
  public void GetOriginWorldPosition(double id0[])
  {
    GetOriginWorldPosition_6(id0);
  }

  private native void SetOriginWorldPosition_7(double id0[]);
  public void SetOriginWorldPosition(double id0[])
  {
    SetOriginWorldPosition_7(id0);
  }

  private native void SetOriginDisplayPosition_8(double id0[]);
  public void SetOriginDisplayPosition(double id0[])
  {
    SetOriginDisplayPosition_8(id0);
  }

  private native void GetOriginDisplayPosition_9(double id0[]);
  public void GetOriginDisplayPosition(double id0[])
  {
    GetOriginDisplayPosition_9(id0);
  }

  private native void SetTolerance_10(int id0);
  public void SetTolerance(int id0)
  {
    SetTolerance_10(id0);
  }

  private native int GetToleranceMinValue_11();
  public int GetToleranceMinValue()
  {
    return GetToleranceMinValue_11();
  }

  private native int GetToleranceMaxValue_12();
  public int GetToleranceMaxValue()
  {
    return GetToleranceMaxValue_12();
  }

  private native int GetTolerance_13();
  public int GetTolerance()
  {
    return GetTolerance_13();
  }

  private native void SetLabelFormat_14(byte[] id0, int len0);
  public void SetLabelFormat(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLabelFormat_14(bytes0, bytes0.length);
  }

  private native byte[] GetLabelFormat_15();
  public String GetLabelFormat()
  {
    return new String(GetLabelFormat_15(), StandardCharsets.UTF_8);
  }

  private native void SetInteractionState_16(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_16(id0);
  }

  private native int GetInteractionStateMinValue_17();
  public int GetInteractionStateMinValue()
  {
    return GetInteractionStateMinValue_17();
  }

  private native int GetInteractionStateMaxValue_18();
  public int GetInteractionStateMaxValue()
  {
    return GetInteractionStateMaxValue_18();
  }

  private native void BuildRepresentation_19();
  public void BuildRepresentation()
  {
    BuildRepresentation_19();
  }

  private native int ComputeInteractionState_20(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_20(id0,id1,id2);
  }

  private native void StartWidgetInteraction_21(double id0[]);
  public void StartWidgetInteraction(double id0[])
  {
    StartWidgetInteraction_21(id0);
  }

  private native void WidgetInteraction_22(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_22(id0);
  }

  private native void ReleaseGraphicsResources_23(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_23(id0);
  }

  private native int RenderOpaqueGeometry_24(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_24(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_25(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_25(id0);
  }

  private native void SetLabelScale_26(double id0,double id1,double id2);
  public void SetLabelScale(double id0,double id1,double id2)
  {
    SetLabelScale_26(id0,id1,id2);
  }

  private native void SetLabelScale_27(double id0[]);
  public void SetLabelScale(double id0[])
  {
    SetLabelScale_27(id0);
  }

  private native long GetLabelProperty_28();
  public vtkProperty GetLabelProperty()
  {
    long temp = GetLabelProperty_28();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkAxesTransformRepresentation() { super(); }

  public vtkAxesTransformRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
