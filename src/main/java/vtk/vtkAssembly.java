// java wrapper for vtkAssembly object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkAssembly extends vtkProp3D
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

  private native void AddPart_4(vtkProp3D id0);
  public void AddPart(vtkProp3D id0)
  {
    AddPart_4(id0);
  }

  private native void RemovePart_5(vtkProp3D id0);
  public void RemovePart(vtkProp3D id0)
  {
    RemovePart_5(id0);
  }

  private native long GetParts_6();
  public vtkProp3DCollection GetParts()
  {
    long temp = GetParts_6();

    if (temp == 0) return null;
    return (vtkProp3DCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetActors_7(vtkPropCollection id0);
  public void GetActors(vtkPropCollection id0)
  {
    GetActors_7(id0);
  }

  private native void GetVolumes_8(vtkPropCollection id0);
  public void GetVolumes(vtkPropCollection id0)
  {
    GetVolumes_8(id0);
  }

  private native int RenderOpaqueGeometry_9(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_9(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_10(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_10(id0);
  }

  private native int RenderVolumetricGeometry_11(vtkViewport id0);
  public int RenderVolumetricGeometry(vtkViewport id0)
  {
    return RenderVolumetricGeometry_11(id0);
  }

  private native int HasTranslucentPolygonalGeometry_12();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_12();
  }

  private native void ReleaseGraphicsResources_13(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_13(id0);
  }

  private native void InitPathTraversal_14();
  public void InitPathTraversal()
  {
    InitPathTraversal_14();
  }

  private native long GetNextPath_15();
  public vtkAssemblyPath GetNextPath()
  {
    long temp = GetNextPath_15();

    if (temp == 0) return null;
    return (vtkAssemblyPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfPaths_16();
  public int GetNumberOfPaths()
  {
    return GetNumberOfPaths_16();
  }

  private native void GetBounds_17(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_17(id0);
  }

  private native double[] GetBounds_18();
  public double[] GetBounds()
  {
    return GetBounds_18();
  }

  private native long GetMTime_19();
  public long GetMTime()
  {
    return GetMTime_19();
  }

  private native void ShallowCopy_20(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_20(id0);
  }

  private native void BuildPaths_21(vtkAssemblyPaths id0,vtkAssemblyPath id1);
  public void BuildPaths(vtkAssemblyPaths id0,vtkAssemblyPath id1)
  {
    BuildPaths_21(id0,id1);
  }

  public vtkAssembly() { super(); }

  public vtkAssembly(long id) { super(id); }
  public native long   VTKInit();

}
