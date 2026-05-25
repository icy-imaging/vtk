// java wrapper for vtkMultiNewickTreeReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMultiNewickTreeReader extends vtkDataReader
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

  private native long GetOutput_4();
  public vtkMultiPieceDataSet GetOutput()
  {
    long temp = GetOutput_4();

    if (temp == 0) return null;
    return (vtkMultiPieceDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutput_5(int id0);
  public vtkMultiPieceDataSet GetOutput(int id0)
  {
    long temp = GetOutput_5(id0);

    if (temp == 0) return null;
    return (vtkMultiPieceDataSet)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetOutput_6(vtkMultiPieceDataSet id0);
  public void SetOutput(vtkMultiPieceDataSet id0)
  {
    SetOutput_6(id0);
  }

  private native int ReadMeshSimple_7(byte[] id0, int len0,vtkDataObject id1);
  public int ReadMeshSimple(String id0,vtkDataObject id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return ReadMeshSimple_7(bytes0, bytes0.length,id1);
  }

  public vtkMultiNewickTreeReader() { super(); }

  public vtkMultiNewickTreeReader(long id) { super(id); }
  public native long   VTKInit();

}
