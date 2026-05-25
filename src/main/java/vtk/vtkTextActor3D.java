// java wrapper for vtkTextActor3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTextActor3D extends vtkProp3D
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

  private native int GetRenderedDPI_8();
  public int GetRenderedDPI()
  {
    return GetRenderedDPI_8();
  }

  private native void ShallowCopy_9(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_9(id0);
  }

  private native double[] GetBounds_10();
  public double[] GetBounds()
  {
    return GetBounds_10();
  }

  private native void GetBounds_11(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_11(id0);
  }

  private native int GetBoundingBox_12(int id0[]);
  public int GetBoundingBox(int id0[])
  {
    return GetBoundingBox_12(id0);
  }

  private native void ReleaseGraphicsResources_13(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_13(id0);
  }

  private native void SetForceOpaque_14(boolean id0);
  public void SetForceOpaque(boolean id0)
  {
    SetForceOpaque_14(id0);
  }

  private native boolean GetForceOpaque_15();
  public boolean GetForceOpaque()
  {
    return GetForceOpaque_15();
  }

  private native void ForceOpaqueOn_16();
  public void ForceOpaqueOn()
  {
    ForceOpaqueOn_16();
  }

  private native void ForceOpaqueOff_17();
  public void ForceOpaqueOff()
  {
    ForceOpaqueOff_17();
  }

  private native void SetForceTranslucent_18(boolean id0);
  public void SetForceTranslucent(boolean id0)
  {
    SetForceTranslucent_18(id0);
  }

  private native boolean GetForceTranslucent_19();
  public boolean GetForceTranslucent()
  {
    return GetForceTranslucent_19();
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

  private native int RenderOpaqueGeometry_22(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_22(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_23(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_23(id0);
  }

  private native int RenderOverlay_24(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_24(id0);
  }

  private native int HasTranslucentPolygonalGeometry_25();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_25();
  }

  public vtkTextActor3D() { super(); }

  public vtkTextActor3D(long id) { super(id); }
  public native long   VTKInit();

}
