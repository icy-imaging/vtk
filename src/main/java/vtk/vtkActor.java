// java wrapper for vtkActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkActor extends vtkProp3D
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

  private native int RenderOpaqueGeometry_5(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_5(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_6(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_6(id0);
  }

  private native int HasTranslucentPolygonalGeometry_7();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_7();
  }

  private native int HasOpaqueGeometry_8();
  public int HasOpaqueGeometry()
  {
    return HasOpaqueGeometry_8();
  }

  private native void Render_9(vtkRenderer id0,vtkMapper id1);
  public void Render(vtkRenderer id0,vtkMapper id1)
  {
    Render_9(id0,id1);
  }

  private native void ShallowCopy_10(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_10(id0);
  }

  private native void ReleaseGraphicsResources_11(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_11(id0);
  }

  private native void SetProperty_12(vtkProperty id0);
  public void SetProperty(vtkProperty id0)
  {
    SetProperty_12(id0);
  }

  private native long GetProperty_13();
  public vtkProperty GetProperty()
  {
    long temp = GetProperty_13();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long MakeProperty_14();
  public vtkProperty MakeProperty()
  {
    long temp = MakeProperty_14();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetBackfaceProperty_15(vtkProperty id0);
  public void SetBackfaceProperty(vtkProperty id0)
  {
    SetBackfaceProperty_15(id0);
  }

  private native long GetBackfaceProperty_16();
  public vtkProperty GetBackfaceProperty()
  {
    long temp = GetBackfaceProperty_16();

    if (temp == 0) return null;
    return (vtkProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTexture_17(vtkTexture id0);
  public void SetTexture(vtkTexture id0)
  {
    SetTexture_17(id0);
  }

  private native long GetTexture_18();
  public vtkTexture GetTexture()
  {
    long temp = GetTexture_18();

    if (temp == 0) return null;
    return (vtkTexture)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetMapper_19(vtkMapper id0);
  public void SetMapper(vtkMapper id0)
  {
    SetMapper_19(id0);
  }

  private native long GetMapper_20();
  public vtkMapper GetMapper()
  {
    long temp = GetMapper_20();

    if (temp == 0) return null;
    return (vtkMapper)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native double[] GetBounds_21();
  public double[] GetBounds()
  {
    return GetBounds_21();
  }

  private native void ApplyProperties_22();
  public void ApplyProperties()
  {
    ApplyProperties_22();
  }

  private native long GetMTime_23();
  public long GetMTime()
  {
    return GetMTime_23();
  }

  private native long GetRedrawMTime_24();
  public long GetRedrawMTime()
  {
    return GetRedrawMTime_24();
  }

  private native boolean GetForceOpaque_25();
  public boolean GetForceOpaque()
  {
    return GetForceOpaque_25();
  }

  private native void SetForceOpaque_26(boolean id0);
  public void SetForceOpaque(boolean id0)
  {
    SetForceOpaque_26(id0);
  }

  private native void ForceOpaqueOn_27();
  public void ForceOpaqueOn()
  {
    ForceOpaqueOn_27();
  }

  private native void ForceOpaqueOff_28();
  public void ForceOpaqueOff()
  {
    ForceOpaqueOff_28();
  }

  private native boolean GetForceTranslucent_29();
  public boolean GetForceTranslucent()
  {
    return GetForceTranslucent_29();
  }

  private native void SetForceTranslucent_30(boolean id0);
  public void SetForceTranslucent(boolean id0)
  {
    SetForceTranslucent_30(id0);
  }

  private native void ForceTranslucentOn_31();
  public void ForceTranslucentOn()
  {
    ForceTranslucentOn_31();
  }

  private native void ForceTranslucentOff_32();
  public void ForceTranslucentOff()
  {
    ForceTranslucentOff_32();
  }

  private native boolean GetSupportsSelection_33();
  public boolean GetSupportsSelection()
  {
    return GetSupportsSelection_33();
  }

  private native boolean IsRenderingTranslucentPolygonalGeometry_34();
  public boolean IsRenderingTranslucentPolygonalGeometry()
  {
    return IsRenderingTranslucentPolygonalGeometry_34();
  }

  private native void SetIsRenderingTranslucentPolygonalGeometry_35(boolean id0);
  public void SetIsRenderingTranslucentPolygonalGeometry(boolean id0)
  {
    SetIsRenderingTranslucentPolygonalGeometry_35(id0);
  }

  private native void GetBounds_36(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_36(id0);
  }

  public vtkActor() { super(); }

  public vtkActor(long id) { super(id); }
  public native long   VTKInit();

}
