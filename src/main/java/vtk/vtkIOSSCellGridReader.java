// java wrapper for vtkIOSSCellGridReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkIOSSCellGridReader extends vtkIOSSReader
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

  private native int ReadMetaData_4(vtkInformation id0);
  public int ReadMetaData(vtkInformation id0)
  {
    return ReadMetaData_4(id0);
  }

  private native int ReadMesh_5(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadMesh(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadMesh_5(id0,id1,id2,id3,id4);
  }

  private native int ReadPoints_6(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadPoints(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadPoints_6(id0,id1,id2,id3,id4);
  }

  private native int ReadArrays_7(int id0,int id1,int id2,int id3,vtkDataObject id4);
  public int ReadArrays(int id0,int id1,int id2,int id3,vtkDataObject id4)
  {
    return ReadArrays_7(id0,id1,id2,id3,id4);
  }

  public vtkIOSSCellGridReader() { super(); }

  public vtkIOSSCellGridReader(long id) { super(id); }
  public native long   VTKInit();

}
