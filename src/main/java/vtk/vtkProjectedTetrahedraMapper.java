// java wrapper for vtkProjectedTetrahedraMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkProjectedTetrahedraMapper extends vtkUnstructuredGridVolumeMapper
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

  private native void SetVisibilitySort_4(vtkVisibilitySort id0);
  public void SetVisibilitySort(vtkVisibilitySort id0)
  {
    SetVisibilitySort_4(id0);
  }

  private native long GetVisibilitySort_5();
  public vtkVisibilitySort GetVisibilitySort()
  {
    long temp = GetVisibilitySort_5();

    if (temp == 0) return null;
    return (vtkVisibilitySort)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void MapScalarsToColors_6(vtkDataArray id0,vtkVolumeProperty id1,vtkDataArray id2);
  public void MapScalarsToColors(vtkDataArray id0,vtkVolumeProperty id1,vtkDataArray id2)
  {
    MapScalarsToColors_6(id0,id1,id2);
  }

  private native void TransformPoints_7(vtkPoints id0,float id1[],float id2[],vtkFloatArray id3);
  public void TransformPoints(vtkPoints id0,float id1[],float id2[],vtkFloatArray id3)
  {
    TransformPoints_7(id0,id1,id2,id3);
  }

  private native boolean IsSupported_8(vtkRenderWindow id0);
  public boolean IsSupported(vtkRenderWindow id0)
  {
    return IsSupported_8(id0);
  }

  public vtkProjectedTetrahedraMapper() { super(); }

  public vtkProjectedTetrahedraMapper(long id) { super(id); }
  public native long   VTKInit();

}
