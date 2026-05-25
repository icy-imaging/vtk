// java wrapper for vtkLightRepresentation object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLightRepresentation extends vtkWidgetRepresentation
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

  private native void SetPositional_4(boolean id0);
  public void SetPositional(boolean id0)
  {
    SetPositional_4(id0);
  }

  private native boolean GetPositional_5();
  public boolean GetPositional()
  {
    return GetPositional_5();
  }

  private native void PositionalOn_6();
  public void PositionalOn()
  {
    PositionalOn_6();
  }

  private native void PositionalOff_7();
  public void PositionalOff()
  {
    PositionalOff_7();
  }

  private native void SetLightPosition_8(double id0[]);
  public void SetLightPosition(double id0[])
  {
    SetLightPosition_8(id0);
  }

  private native double[] GetLightPosition_9();
  public double[] GetLightPosition()
  {
    return GetLightPosition_9();
  }

  private native void SetFocalPoint_10(double id0[]);
  public void SetFocalPoint(double id0[])
  {
    SetFocalPoint_10(id0);
  }

  private native double[] GetFocalPoint_11();
  public double[] GetFocalPoint()
  {
    return GetFocalPoint_11();
  }

  private native void SetConeAngle_12(double id0);
  public void SetConeAngle(double id0)
  {
    SetConeAngle_12(id0);
  }

  private native double GetConeAngle_13();
  public double GetConeAngle()
  {
    return GetConeAngle_13();
  }

  private native double[] GetLightColor_14();
  public double[] GetLightColor()
  {
    return GetLightColor_14();
  }

  private native void SetInteractionState_15(int id0);
  public void SetInteractionState(int id0)
  {
    SetInteractionState_15(id0);
  }

  private native int GetInteractionStateMinValue_16();
  public int GetInteractionStateMinValue()
  {
    return GetInteractionStateMinValue_16();
  }

  private native int GetInteractionStateMaxValue_17();
  public int GetInteractionStateMaxValue()
  {
    return GetInteractionStateMaxValue_17();
  }

  private native long GetProperty_18();
  public vtkProperty GetProperty()
  {
    long temp = GetProperty_18();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
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

  public vtkLightRepresentation() { super(); }

  public vtkLightRepresentation(long id) { super(id); }
  public native long   VTKInit();

}
