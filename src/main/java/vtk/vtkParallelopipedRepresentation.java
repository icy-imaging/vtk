// java wrapper for vtkParallelopipedRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkParallelopipedRepresentation extends vtkWidgetRepresentation
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

  private native void GetActors_4(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_4(id0);
  }

  private native void PlaceWidget_5(double id0[]);
  public void PlaceWidget(double id0[])
  {
    PlaceWidget_5(id0);
  }

  private native void SetInteractionState_6(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_6(id0);
  }

  private native void GetBoundingPlanes_7(vtkPlaneCollection id0);
  public void GetBoundingPlanes(vtkPlaneCollection id0)
  {
    GetBoundingPlanes_7(id0);
  }

  private native void GetPolyData_8(vtkPolyData id0);
  public void GetPolyData(vtkPolyData id0)
  {
    GetPolyData_8(id0);
  }

  private native double[] GetBounds_9();
  public double[] GetBounds()
  {
    return GetBounds_9();
  }

  private native void SetHandleProperty_10(vtkProperty id0);
  public void SetHandleProperty(vtkProperty id0)
  {
    SetHandleProperty_10(id0);
  }

  private native void SetHoveredHandleProperty_11(vtkProperty id0);
  public void SetHoveredHandleProperty(vtkProperty id0)
  {
    SetHoveredHandleProperty_11(id0);
  }

  private native void SetSelectedHandleProperty_12(vtkProperty id0);
  public void SetSelectedHandleProperty(vtkProperty id0)
  {
    SetSelectedHandleProperty_12(id0);
  }

  private native long GetHandleProperty_13();
  public vtkProperty GetHandleProperty()
  {
    long temp = GetHandleProperty_13();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetHoveredHandleProperty_14();
  public vtkProperty GetHoveredHandleProperty()
  {
    long temp = GetHoveredHandleProperty_14();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedHandleProperty_15();
  public vtkProperty GetSelectedHandleProperty()
  {
    long temp = GetSelectedHandleProperty_15();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetHandleRepresentation_16(vtkHandleRepresentation id0);
  public void SetHandleRepresentation(vtkHandleRepresentation id0)
  {
    SetHandleRepresentation_16(id0);
  }

  private native long GetHandleRepresentation_17(int id0);
  public vtkHandleRepresentation GetHandleRepresentation(int id0)
  {
    long temp = GetHandleRepresentation_17(id0);

    if (temp == 0) return null;
    return (vtkHandleRepresentation)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void HandlesOn_18();
  public void HandlesOn()
  {
    HandlesOn_18();
  }

  private native void HandlesOff_19();
  public void HandlesOff()
  {
    HandlesOff_19();
  }

  private native long GetFaceProperty_20();
  public vtkProperty GetFaceProperty()
  {
    long temp = GetFaceProperty_20();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedFaceProperty_21();
  public vtkProperty GetSelectedFaceProperty()
  {
    long temp = GetSelectedFaceProperty_21();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutlineProperty_22();
  public vtkProperty GetOutlineProperty()
  {
    long temp = GetOutlineProperty_22();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedOutlineProperty_23();
  public vtkProperty GetSelectedOutlineProperty()
  {
    long temp = GetSelectedOutlineProperty_23();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BuildRepresentation_24();
  public void BuildRepresentation()
  {
    BuildRepresentation_24();
  }

  private native void ReleaseGraphicsResources_25(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_25(id0);
  }

  private native int RenderOverlay_26(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_26(id0);
  }

  private native int RenderOpaqueGeometry_27(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_27(id0);
  }

  private native int ComputeInteractionState_28(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_28(id0,id1,id2);
  }

  private native void Translate_29(double id0[]);
  public void Translate(double id0[])
  {
    Translate_29(id0);
  }

  private native void Translate_30(int id0,int id1);
  public void Translate(int id0,int id1)
  {
    Translate_30(id0,id1);
  }

  private native void Scale_31(int id0,int id1);
  public void Scale(int id0,int id1)
  {
    Scale_31(id0,id1);
  }

  private native void PositionHandles_32();
  public void PositionHandles()
  {
    PositionHandles_32();
  }

  private native void SetMinimumThickness_33(double id0);
  public void SetMinimumThickness(double id0)
  {
    SetMinimumThickness_33(id0);
  }

  private native double GetMinimumThickness_34();
  public double GetMinimumThickness()
  {
    return GetMinimumThickness_34();
  }

  public vtkParallelopipedRepresentation() { super(); }

  public vtkParallelopipedRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
