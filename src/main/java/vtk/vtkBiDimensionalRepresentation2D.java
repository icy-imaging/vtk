// java wrapper for vtkBiDimensionalRepresentation2D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBiDimensionalRepresentation2D extends vtkBiDimensionalRepresentation
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

  private native long GetLineProperty_4();
  public vtkProperty2D GetLineProperty()
  {
    long temp = GetLineProperty_4();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetSelectedLineProperty_5();
  public vtkProperty2D GetSelectedLineProperty()
  {
    long temp = GetSelectedLineProperty_5();

    if (temp == 0) return null;
    return (vtkProperty2D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTextProperty_6();
  public vtkTextProperty GetTextProperty()
  {
    long temp = GetTextProperty_6();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void BuildRepresentation_7();
  public void BuildRepresentation()
  {
    BuildRepresentation_7();
  }

  private native int ComputeInteractionState_8(int id0,int id1,int id2);
  public int ComputeInteractionState(int id0,int id1,int id2)
  {
    return ComputeInteractionState_8(id0,id1,id2);
  }

  private native void StartWidgetDefinition_9(double id0[]);
  public void StartWidgetDefinition(double id0[])
  {
    StartWidgetDefinition_9(id0);
  }

  private native void Point2WidgetInteraction_10(double id0[]);
  public void Point2WidgetInteraction(double id0[])
  {
    Point2WidgetInteraction_10(id0);
  }

  private native void Point3WidgetInteraction_11(double id0[]);
  public void Point3WidgetInteraction(double id0[])
  {
    Point3WidgetInteraction_11(id0);
  }

  private native void StartWidgetManipulation_12(double id0[]);
  public void StartWidgetManipulation(double id0[])
  {
    StartWidgetManipulation_12(id0);
  }

  private native void WidgetInteraction_13(double id0[]);
  public void WidgetInteraction(double id0[])
  {
    WidgetInteraction_13(id0);
  }

  private native void Highlight_14(int id0);
  public void Highlight(int id0)
  {
    Highlight_14(id0);
  }

  private native void ReleaseGraphicsResources_15(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_15(id0);
  }

  private native int RenderOverlay_16(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_16(id0);
  }

  private native byte[] GetLabelText_17();
  public String GetLabelText()
  {
    return new String(GetLabelText_17(), StandardCharsets.UTF_8);
  }

  private native void GetLabelPosition_18(double id0[]);
  public void GetLabelPosition(double id0[])
  {
    GetLabelPosition_18(id0);
  }

  private native void GetWorldLabelPosition_19(double id0[]);
  public void GetWorldLabelPosition(double id0[])
  {
    GetWorldLabelPosition_19(id0);
  }

  public vtkBiDimensionalRepresentation2D() { super(); }

  public vtkBiDimensionalRepresentation2D(long id) { super(id); }
  public native long   VTKInit();

}
