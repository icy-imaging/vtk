// java wrapper for vtkImageStack object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageStack extends vtkImageSlice
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

  private native void AddImage_4(vtkImageSlice id0);
  public void AddImage(vtkImageSlice id0)
  {
    AddImage_4(id0);
  }

  private native void RemoveImage_5(vtkImageSlice id0);
  public void RemoveImage(vtkImageSlice id0)
  {
    RemoveImage_5(id0);
  }

  private native int HasImage_6(vtkImageSlice id0);
  public int HasImage(vtkImageSlice id0)
  {
    return HasImage_6(id0);
  }

  private native long GetImages_7();
  public vtkImageSliceCollection GetImages()
  {
    long temp = GetImages_7();

    if (temp == 0) return null;
    return (vtkImageSliceCollection)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetActiveLayer_8(int id0);
  public void SetActiveLayer(int id0)
  {
    SetActiveLayer_8(id0);
  }

  private native int GetActiveLayer_9();
  public int GetActiveLayer()
  {
    return GetActiveLayer_9();
  }

  private native long GetActiveImage_10();
  public vtkImageSlice GetActiveImage()
  {
    long temp = GetActiveImage_10();

    if (temp == 0) return null;
    return (vtkImageSlice)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMapper_11();
  public vtkImageMapper3D GetMapper()
  {
    long temp = GetMapper_11();

    if (temp == 0) return null;
    return (vtkImageMapper3D)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetProperty_12();
  public vtkImageProperty GetProperty()
  {
    long temp = GetProperty_12();

    if (temp == 0) return null;
    return (vtkImageProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetBounds_13(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_13(id0);
  }

  private native long GetMTime_14();
  public long GetMTime()
  {
    return GetMTime_14();
  }

  private native long GetRedrawMTime_15();
  public long GetRedrawMTime()
  {
    return GetRedrawMTime_15();
  }

  private native void ShallowCopy_16(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_16(id0);
  }

  private native void GetImages_17(vtkPropCollection id0);
  public void GetImages(vtkPropCollection id0)
  {
    GetImages_17(id0);
  }

  private native int RenderOverlay_18(vtkViewport id0);
  public int RenderOverlay(vtkViewport id0)
  {
    return RenderOverlay_18(id0);
  }

  private native int RenderOpaqueGeometry_19(vtkViewport id0);
  public int RenderOpaqueGeometry(vtkViewport id0)
  {
    return RenderOpaqueGeometry_19(id0);
  }

  private native int RenderTranslucentPolygonalGeometry_20(vtkViewport id0);
  public int RenderTranslucentPolygonalGeometry(vtkViewport id0)
  {
    return RenderTranslucentPolygonalGeometry_20(id0);
  }

  private native int HasTranslucentPolygonalGeometry_21();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_21();
  }

  private native void ReleaseGraphicsResources_22(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_22(id0);
  }

  private native void InitPathTraversal_23();
  public void InitPathTraversal()
  {
    InitPathTraversal_23();
  }

  private native long GetNextPath_24();
  public vtkAssemblyPath GetNextPath()
  {
    long temp = GetNextPath_24();

    if (temp == 0) return null;
    return (vtkAssemblyPath)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetNumberOfPaths_25();
  public int GetNumberOfPaths()
  {
    return GetNumberOfPaths_25();
  }

  private native void BuildPaths_26(vtkAssemblyPaths id0,vtkAssemblyPath id1);
  public void BuildPaths(vtkAssemblyPaths id0,vtkAssemblyPath id1)
  {
    BuildPaths_26(id0,id1);
  }

  public vtkImageStack() { super(); }

  public vtkImageStack(long id) { super(id); }
  public native long   VTKInit();

}
