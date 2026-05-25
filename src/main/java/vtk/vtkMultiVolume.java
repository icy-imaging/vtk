// java wrapper for vtkMultiVolume object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMultiVolume extends vtkVolume
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

  private native void SetVolume_4(vtkVolume id0,int id1);
  public void SetVolume(vtkVolume id0,int id1)
  {
    SetVolume_4(id0,id1);
  }

  private native long GetVolume_5(int id0);
  public vtkVolume GetVolume(int id0)
  {
    long temp = GetVolume_5(id0);

    if (temp == 0) return null;
    return (vtkVolume)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void RemoveVolume_6(int id0);
  public void RemoveVolume(int id0)
  {
    RemoveVolume_6(id0);
  }

  private native void SetProperty_7(vtkVolumeProperty id0);
  public void SetProperty(vtkVolumeProperty id0)
  {
    SetProperty_7(id0);
  }

  private native long GetProperty_8();
  public vtkVolumeProperty GetProperty()
  {
    long temp = GetProperty_8();

    if (temp == 0) return null;
    return (vtkVolumeProperty)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_9();
  public long GetMTime()
  {
    return GetMTime_9();
  }

  private native void ShallowCopy_10(vtkProp id0);
  public void ShallowCopy(vtkProp id0)
  {
    ShallowCopy_10(id0);
  }

  private native long GetMatrix_11();
  public vtkMatrix4x4 GetMatrix()
  {
    long temp = GetMatrix_11();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetTextureMatrix_12();
  public vtkMatrix4x4 GetTextureMatrix()
  {
    long temp = GetTextureMatrix_12();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetBoundsTime_13();
  public long GetBoundsTime()
  {
    return GetBoundsTime_13();
  }

  private native int RenderVolumetricGeometry_14(vtkViewport id0);
  public int RenderVolumetricGeometry(vtkViewport id0)
  {
    return RenderVolumetricGeometry_14(id0);
  }

  private native void GetMatrix_15(vtkMatrix4x4 id0);
  public void GetMatrix(vtkMatrix4x4 id0)
  {
    GetMatrix_15(id0);
  }

  private native void GetMatrix_16(double id0[]);
  public void GetMatrix(double id0[])
  {
    GetMatrix_16(id0);
  }

  public vtkMultiVolume() { super(); }

  public vtkMultiVolume(long id) { super(id); }
  public native long   VTKInit();

}
