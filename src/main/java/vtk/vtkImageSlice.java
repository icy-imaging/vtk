// java wrapper for vtkImageSlice object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageSlice extends vtkProp3D
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

  private native void SetMapper_4(vtkImageMapper3D id0);
  public void SetMapper(vtkImageMapper3D id0)
  {
    SetMapper_4(id0);
  }

  private native long GetMapper_5();
  public vtkImageMapper3D GetMapper()
  {
    long temp = GetMapper_5();

    if (temp == 0) return null;
    return (vtkImageMapper3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetProperty_6(vtkImageProperty id0);
  public void SetProperty(vtkImageProperty id0)
  {
    SetProperty_6(id0);
  }

  private native long GetProperty_7();
  public vtkImageProperty GetProperty()
  {
    long temp = GetProperty_7();

    if (temp == 0) return null;
    return (vtkImageProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Update_8();
  public void Update()
  {
    Update_8();
  }

  private native void GetBounds_9(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_9(id0);
  }

  private native double GetMinXBound_10();
  public double GetMinXBound()
  {
    return GetMinXBound_10();
  }

  private native double GetMaxXBound_11();
  public double GetMaxXBound()
  {
    return GetMaxXBound_11();
  }

  private native double GetMinYBound_12();
  public double GetMinYBound()
  {
    return GetMinYBound_12();
  }

  private native double GetMaxYBound_13();
  public double GetMaxYBound()
  {
    return GetMaxYBound_13();
  }

  private native double GetMinZBound_14();
  public double GetMinZBound()
  {
    return GetMinZBound_14();
  }

  private native double GetMaxZBound_15();
  public double GetMaxZBound()
  {
    return GetMaxZBound_15();
  }

  private native long GetMTime_16();
  public long GetMTime()
  {
    return GetMTime_16();
  }

  private native long GetRedrawMTime_17();
  public long GetRedrawMTime()
  {
    return GetRedrawMTime_17();
  }

  private native boolean GetForceTranslucent_18();
  public boolean GetForceTranslucent()
  {
    return GetForceTranslucent_18();
  }

  private native void SetForceTranslucent_19(boolean id0);
  public void SetForceTranslucent(boolean id0)
  {
    SetForceTranslucent_19(id0);
  }

  private native void ForceTranslucentOn_20();
  public void ForceTranslucentOn()
  {
    ForceTranslucentOn_20();
  }

  private native void ForceTranslucentOff_21();
  public void ForceTranslucentOff()
  {
    ForceTranslucentOff_21();
  }

  private native void ShallowCopy_22(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_22(id0);
  }

  private native void GetImages_23(vtkPropCollection id0);
  public void GetImages(vtkPropCollection id0)
  {
    GetImages_23(id0);
  }

  private native int RenderOverlay_24(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_24(id0);
  }

  private native int RenderOpaqueGeometry_25(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_25(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_26(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_26(id0);
  }

  private native int HasTranslucentPolygonalGeometry_27();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_27();
  }

  private native void Render_28(vtkRenderer id0);
  public void Render(vtkRenderer id0)
  {
    Render_28(id0);
  }

  private native void ReleaseGraphicsResources_29(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_29(id0);
  }

  private native void SetStackedImagePass_30(int id0);
  public void SetStackedImagePass(int id0)
  {
    SetStackedImagePass_30(id0);
  }

  public vtkImageSlice() { super(); }

  public vtkImageSlice(long id) { super(id); }
  public native long   VTKInit();

}
