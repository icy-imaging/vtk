// java wrapper for vtkOpenGLGPUVolumeRayCastMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOpenGLGPUVolumeRayCastMapper extends vtkGPUVolumeRayCastMapper
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

  private native long GetDepthTexture_4();
  public vtkTextureObject GetDepthTexture()
  {
    long temp = GetDepthTexture_4();

    if (temp == 0) return null;
    return (vtkTextureObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetColorTexture_5();
  public vtkTextureObject GetColorTexture()
  {
    long temp = GetColorTexture_5();

    if (temp == 0) return null;
    return (vtkTextureObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetDepthImage_6(vtkImageData id0);
  public void GetDepthImage(vtkImageData id0)
  {
    GetDepthImage_6(id0);
  }

  private native void GetColorImage_7(vtkImageData id0);
  public void GetColorImage(vtkImageData id0)
  {
    GetColorImage_7(id0);
  }

  private native int GetCurrentPass_8();
  public int GetCurrentPass()
  {
    return GetCurrentPass_8();
  }

  private native void SetSharedDepthTexture_9(vtkTextureObject id0);
  public void SetSharedDepthTexture(vtkTextureObject id0)
  {
    SetSharedDepthTexture_9(id0);
  }

  private native void SetPartitions_10(short id0,short id1,short id2);
  public void SetPartitions(short id0,short id1,short id2)
  {
    SetPartitions_10(id0,id1,id2);
  }

  private native boolean PreLoadData_11(vtkRenderer id0,vtkVolume id1);
  public boolean PreLoadData(vtkRenderer id0,vtkVolume id1)
  {
    return PreLoadData_11(id0,id1);
  }

  private native void ReleaseGraphicsResources_12(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_12(id0);
  }

  public vtkOpenGLGPUVolumeRayCastMapper() { super(); }

  public vtkOpenGLGPUVolumeRayCastMapper(long id) { super(id); }
  public native long   VTKInit();

}
