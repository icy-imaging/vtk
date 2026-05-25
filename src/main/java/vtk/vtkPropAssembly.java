// java wrapper for vtkPropAssembly object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPropAssembly extends vtkProp
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

  private native void AddPart_4(vtkProp id0);
  public void AddPart(vtkProp id0)
  {
    AddPart_4(id0);
  }

  private native void RemovePart_5(vtkProp id0);
  public void RemovePart(vtkProp id0)
  {
    RemovePart_5(id0);
  }

  private native long GetParts_6();
  public vtkPropCollection GetParts()
  {
    long temp = GetParts_6();

    if (temp == 0) return null;
    return (vtkPropCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int RenderOpaqueGeometry_7(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_7(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_8(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_8(id0);
  }

  private native int RenderVolumetricGeometry_9(vtkViewport id0);
  public int RenderVolumetricGeometry(vtkViewport id0)
  {
    return RenderVolumetricGeometry_9(id0);
  }

  private native int RenderOverlay_10(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_10(id0);
  }

  private native int HasTranslucentPolygonalGeometry_11();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_11();
  }

  private native void ReleaseGraphicsResources_12(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_12(id0);
  }

  private native double[] GetBounds_13();
  public double[] GetBounds()
  {
    return GetBounds_13();
  }

  private native void ShallowCopy_14(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_14(id0);
  }

  private native long GetMTime_15();
  public long GetMTime()
  {
    return GetMTime_15();
  }

  private native void InitPathTraversal_16();
  public void InitPathTraversal()
  {
    InitPathTraversal_16();
  }

  private native long GetNextPath_17();
  public vtkAssemblyPath GetNextPath()
  {
    long temp = GetNextPath_17();

    if (temp == 0) return null;
    return (vtkAssemblyPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfPaths_18();
  public int GetNumberOfPaths()
  {
    return GetNumberOfPaths_18();
  }

  private native void BuildPaths_19(vtkAssemblyPaths id0,vtkAssemblyPath id1);
  public void BuildPaths(vtkAssemblyPaths id0,vtkAssemblyPath id1)
  {
    BuildPaths_19(id0,id1);
  }

  public vtkPropAssembly() { super(); }

  public vtkPropAssembly(long id) { super(id); }
  public native long   VTKInit();

}
