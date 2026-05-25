// java wrapper for vtkCirclePackToPolyData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCirclePackToPolyData extends vtkPolyDataAlgorithm
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

  private native void SetCirclesArrayName_4(byte[] id0, int len0);
  public void SetCirclesArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCirclesArrayName_4(bytes0, bytes0.length);
  }

  private native void SetResolution_5(int id0);
  public void SetResolution(int id0)
  {
    SetResolution_5(id0);
  }

  private native int GetResolution_6();
  public int GetResolution()
  {
    return GetResolution_6();
  }

  private native int FillInputPortInformation_7(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_7(id0,id1);
  }

  public vtkCirclePackToPolyData() { super(); }

  public vtkCirclePackToPolyData(long id) { super(id); }
  public native long   VTKInit();

}
