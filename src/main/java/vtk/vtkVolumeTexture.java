// java wrapper for vtkVolumeTexture object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVolumeTexture extends vtkObject
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

  private native void SetPartitions_4(int id0,int id1,int id2);
  public void SetPartitions(int id0,int id1,int id2)
  {
    SetPartitions_4(id0,id1,id2);
  }

  private native boolean LoadVolume_5(vtkRenderer id0,vtkDataSet id1,vtkDataArray id2,int id3,int id4);
  public boolean LoadVolume(vtkRenderer id0,vtkDataSet id1,vtkDataArray id2,int id3,int id4)
  {
    return LoadVolume_5(id0,id1,id2,id3,id4);
  }

  private native void UpdateVolume_6(vtkVolumeProperty id0);
  public void UpdateVolume(vtkVolumeProperty id0)
  {
    UpdateVolume_6(id0);
  }

  private native void SortBlocksBackToFront_7(vtkRenderer id0,vtkMatrix4x4 id1);
  public void SortBlocksBackToFront(vtkRenderer id0,vtkMatrix4x4 id1)
  {
    SortBlocksBackToFront_7(id0,id1);
  }

  private native void ReleaseGraphicsResources_8(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_8(id0);
  }

  private native long GetLoadedScalars_9();
  public vtkDataArray GetLoadedScalars()
  {
    long temp = GetLoadedScalars_9();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkVolumeTexture() { super(); }

  public vtkVolumeTexture(long id) { super(id); }
  public native long   VTKInit();

}
