// java wrapper for vtkTreeMapToPolyData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTreeMapToPolyData extends vtkPolyDataAlgorithm
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

  private native void SetRectanglesArrayName_4(byte[] id0, int len0);
  public void SetRectanglesArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetRectanglesArrayName_4(bytes0, bytes0.length);
  }

  private native void SetLevelArrayName_5(byte[] id0, int len0);
  public void SetLevelArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetLevelArrayName_5(bytes0, bytes0.length);
  }

  private native double GetLevelDeltaZ_6();
  public double GetLevelDeltaZ()
  {
    return GetLevelDeltaZ_6();
  }

  private native void SetLevelDeltaZ_7(double id0);
  public void SetLevelDeltaZ(double id0)
  {
    SetLevelDeltaZ_7(id0);
  }

  private native boolean GetAddNormals_8();
  public boolean GetAddNormals()
  {
    return GetAddNormals_8();
  }

  private native void SetAddNormals_9(boolean id0);
  public void SetAddNormals(boolean id0)
  {
    SetAddNormals_9(id0);
  }

  private native int FillInputPortInformation_10(int id0,vtkInformation id1);
  public int FillInputPortInformation(int id0,vtkInformation id1)
  {
    return FillInputPortInformation_10(id0,id1);
  }

  public vtkTreeMapToPolyData() { super(); }

  public vtkTreeMapToPolyData(long id) { super(id); }
  public native long   VTKInit();

}
