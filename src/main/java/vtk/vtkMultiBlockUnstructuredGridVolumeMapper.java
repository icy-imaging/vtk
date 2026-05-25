// java wrapper for vtkMultiBlockUnstructuredGridVolumeMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMultiBlockUnstructuredGridVolumeMapper extends vtkUnstructuredGridVolumeMapper
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

  private native void SelectScalarArray_4(int id0);
  public void SelectScalarArray(int id0)
  {
    SelectScalarArray_4(id0);
  }

  private native void SelectScalarArray_5(byte[] id0, int len0);
  public void SelectScalarArray(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SelectScalarArray_5(bytes0, bytes0.length);
  }

  private native void SetScalarMode_6(int id0);
  public void SetScalarMode(int id0)
  {
    SetScalarMode_6(id0);
  }

  private native void SetArrayAccessMode_7(int id0);
  public void SetArrayAccessMode(int id0)
  {
    SetArrayAccessMode_7(id0);
  }

  private native void Render_8(vtkRenderer id0,vtkVolume id1);
  public void Render(vtkRenderer id0,vtkVolume id1)
  {
    Render_8(id0,id1);
  }

  private native void ReleaseGraphicsResources_9(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_9(id0);
  }

  private native void SetUseFloatingPointFrameBuffer_10(boolean id0);
  public void SetUseFloatingPointFrameBuffer(boolean id0)
  {
    SetUseFloatingPointFrameBuffer_10(id0);
  }

  private native boolean GetUseFloatingPointFrameBuffer_11();
  public boolean GetUseFloatingPointFrameBuffer()
  {
    return GetUseFloatingPointFrameBuffer_11();
  }

  private native void SetBlendMode_12(int id0);
  public void SetBlendMode(int id0)
  {
    SetBlendMode_12(id0);
  }

  private native void GetBounds_13(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_13(id0);
  }

  public vtkMultiBlockUnstructuredGridVolumeMapper() { super(); }

  public vtkMultiBlockUnstructuredGridVolumeMapper(long id) { super(id); }
  public native long   VTKInit();

}
