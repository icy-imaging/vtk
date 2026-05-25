// java wrapper for vtkBillboardTextActor3D object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBillboardTextActor3D extends vtkProp3D
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

  private native void UpdateGeometry_5(vtkViewport id0);
  public void UpdateGeometry(vtkViewport id0)
  {
    UpdateGeometry_5(id0);
  }

  private native void SetInput_6(byte[] id0, int len0);
  public void SetInput(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetInput_6(bytes0, bytes0.length);
  }

  private native byte[] GetInput_7();
  public String GetInput()
  {
    return new String(GetInput_7(), StandardCharsets.UTF_8);
  }

  private native int[] GetDisplayOffset_8();
  public int[] GetDisplayOffset()
  {
    return GetDisplayOffset_8();
  }

  private native void SetDisplayOffset_9(int id0,int id1);
  public void SetDisplayOffset(int id0,int id1)
  {
    SetDisplayOffset_9(id0,id1);
  }

  private native void SetDisplayOffset_10(int id0[]);
  public void SetDisplayOffset(int id0[])
  {
    SetDisplayOffset_10(id0);
  }

  private native void SetTextProperty_11(vtkTextProperty id0);
  public void SetTextProperty(vtkTextProperty id0)
  {
    SetTextProperty_11(id0);
  }

  private native long GetTextProperty_12();
  public vtkTextProperty GetTextProperty()
  {
    long temp = GetTextProperty_12();

    if (temp == 0) return null;
    return (vtkTextProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetForceOpaque_13(boolean id0);
  public void SetForceOpaque(boolean id0)
  {
    SetForceOpaque_13(id0);
  }

  private native boolean GetForceOpaque_14();
  public boolean GetForceOpaque()
  {
    return GetForceOpaque_14();
  }

  private native void ForceOpaqueOn_15();
  public void ForceOpaqueOn()
  {
    ForceOpaqueOn_15();
  }

  private native void ForceOpaqueOff_16();
  public void ForceOpaqueOff()
  {
    ForceOpaqueOff_16();
  }

  private native void SetForceTranslucent_17(boolean id0);
  public void SetForceTranslucent(boolean id0)
  {
    SetForceTranslucent_17(id0);
  }

  private native boolean GetForceTranslucent_18();
  public boolean GetForceTranslucent()
  {
    return GetForceTranslucent_18();
  }

  private native void ForceTranslucentOn_19();
  public void ForceTranslucentOn()
  {
    ForceTranslucentOn_19();
  }

  private native void ForceTranslucentOff_20();
  public void ForceTranslucentOff()
  {
    ForceTranslucentOff_20();
  }

  private native int HasTranslucentPolygonalGeometry_21();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_21();
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

  private native void ReleaseGraphicsResources_24(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_24(id0);
  }

  private native double[] GetAnchorDC_25();
  public double[] GetAnchorDC()
  {
    return GetAnchorDC_25();
  }

  private native void GetBounds_26(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_26(id0);
  }

  public vtkBillboardTextActor3D() { super(); }

  public vtkBillboardTextActor3D(long id) { super(id); }
  public native long   VTKInit();

}
