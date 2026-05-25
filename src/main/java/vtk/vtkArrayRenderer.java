// java wrapper for vtkArrayRenderer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkArrayRenderer extends vtkMapper
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

  private native void PrepareColormap_4(vtkScalarsToColors id0);
  public void PrepareColormap(vtkScalarsToColors id0)
  {
    PrepareColormap_4(id0);
  }

  private native double[] GetBounds_5();
  public double[] GetBounds()
  {
    return GetBounds_5();
  }

  private native void Render_6(vtkRenderer id0,vtkActor id1);
  public void Render(vtkRenderer id0,vtkActor id1)
  {
    Render_6(id0,id1);
  }

  private native void ReleaseGraphicsResources_7(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_7(id0);
  }

  private native int GetHasOpaque_8();
  public int GetHasOpaque()
  {
    return GetHasOpaque_8();
  }

  private native void SetHasOpaque_9(int id0);
  public void SetHasOpaque(int id0)
  {
    SetHasOpaque_9(id0);
  }

  private native int GetHasTranslucent_10();
  public int GetHasTranslucent()
  {
    return GetHasTranslucent_10();
  }

  private native void SetHasTranslucent_11(int id0);
  public void SetHasTranslucent(int id0)
  {
    SetHasTranslucent_11(id0);
  }

  private native boolean HasOpaqueGeometry_12();
  public boolean HasOpaqueGeometry()
  {
    return HasOpaqueGeometry_12();
  }

  private native boolean HasTranslucentPolygonalGeometry_13();
  public boolean HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_13();
  }

  private native void SetVertexShaderSource_14(byte[] id0, int len0);
  public void SetVertexShaderSource(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetVertexShaderSource_14(bytes0, bytes0.length);
  }

  private native byte[] GetVertexShaderSource_15();
  public String GetVertexShaderSource()
  {
    return new String(GetVertexShaderSource_15(), StandardCharsets.UTF_8);
  }

  private native void SetFragmentShaderSource_16(byte[] id0, int len0);
  public void SetFragmentShaderSource(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFragmentShaderSource_16(bytes0, bytes0.length);
  }

  private native byte[] GetFragmentShaderSource_17();
  public String GetFragmentShaderSource()
  {
    return new String(GetFragmentShaderSource_17(), StandardCharsets.UTF_8);
  }

  private native void ResetModsToDefault_18();
  public void ResetModsToDefault()
  {
    ResetModsToDefault_18();
  }

  private native void AddMod_19(byte[] id0, int len0);
  public void AddMod(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    AddMod_19(bytes0, bytes0.length);
  }

  private native void RemoveMod_20(byte[] id0, int len0);
  public void RemoveMod(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    RemoveMod_20(bytes0, bytes0.length);
  }

  private native void RemoveAllMods_21();
  public void RemoveAllMods()
  {
    RemoveAllMods_21();
  }

  private native void GetBounds_22(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_22(id0);
  }

  private native long GetShader_23(int id0);
  public vtkShader GetShader(int id0)
  {
    long temp = GetShader_23(id0);

    if (temp == 0) return null;
    return (vtkShader)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean SetNumberOfInstances_24(long id0);
  public boolean SetNumberOfInstances(long id0)
  {
    return SetNumberOfInstances_24(id0);
  }

  private native boolean SetNumberOfElements_25(long id0);
  public boolean SetNumberOfElements(long id0)
  {
    return SetNumberOfElements_25(id0);
  }

  private native boolean SetElementType_26(int id0);
  public boolean SetElementType(int id0)
  {
    return SetElementType_26(id0);
  }

  public vtkArrayRenderer() { super(); }

  public vtkArrayRenderer(long id) { super(id); }
  public native long   VTKInit();

}
