// java wrapper for vtkFlagpoleLabel object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFlagpoleLabel extends vtkActor
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

  private native void SetInput_4(byte[] id0, int len0);
  public void SetInput(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInput_4(bytes0, bytes0.length);
  }

  private native byte[] GetInput_5();
  public String GetInput()
  {
    return new String(GetInput_5(), StandardCharsets.UTF_8);
  }

  private native void SetTextProperty_6(vtkTextProperty id0);
  public void SetTextProperty(vtkTextProperty id0)
  {
    SetTextProperty_6(id0);
  }

  private native long GetTextProperty_7();
  public vtkTextProperty GetTextProperty()
  {
    long temp = GetTextProperty_7();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetForceOpaque_8(boolean id0);
  public void SetForceOpaque(boolean id0)
  {
    SetForceOpaque_8(id0);
  }

  private native boolean GetForceOpaque_9();
  public boolean GetForceOpaque()
  {
    return GetForceOpaque_9();
  }

  private native void ForceOpaqueOn_10();
  public void ForceOpaqueOn()
  {
    ForceOpaqueOn_10();
  }

  private native void ForceOpaqueOff_11();
  public void ForceOpaqueOff()
  {
    ForceOpaqueOff_11();
  }

  private native void SetForceTranslucent_12(boolean id0);
  public void SetForceTranslucent(boolean id0)
  {
    SetForceTranslucent_12(id0);
  }

  private native boolean GetForceTranslucent_13();
  public boolean GetForceTranslucent()
  {
    return GetForceTranslucent_13();
  }

  private native void ForceTranslucentOn_14();
  public void ForceTranslucentOn()
  {
    ForceTranslucentOn_14();
  }

  private native void ForceTranslucentOff_15();
  public void ForceTranslucentOff()
  {
    ForceTranslucentOff_15();
  }

  private native int HasTranslucentPolygonalGeometry_16();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_16();
  }

  private native int RenderOpaqueGeometry_17(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_17(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_18(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_18(id0);
  }

  private native void ReleaseGraphicsResources_19(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_19(id0);
  }

  private native double[] GetBasePosition_20();
  public double[] GetBasePosition()
  {
    return GetBasePosition_20();
  }

  private native void SetBasePosition_21(double id0,double id1,double id2);
  public void SetBasePosition(double id0,double id1,double id2)
  {
    SetBasePosition_21(id0,id1,id2);
  }

  private native double[] GetTopPosition_22();
  public double[] GetTopPosition()
  {
    return GetTopPosition_22();
  }

  private native void SetTopPosition_23(double id0,double id1,double id2);
  public void SetTopPosition(double id0,double id1,double id2)
  {
    SetTopPosition_23(id0,id1,id2);
  }

  private native double GetFlagSize_24();
  public double GetFlagSize()
  {
    return GetFlagSize_24();
  }

  private native void SetFlagSize_25(double id0);
  public void SetFlagSize(double id0)
  {
    SetFlagSize_25(id0);
  }

  private native void GetBounds_26(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_26(id0);
  }

  public vtkFlagpoleLabel() { super(); }

  public vtkFlagpoleLabel(long id) { super(id); }
  public native long   VTKInit();

}
