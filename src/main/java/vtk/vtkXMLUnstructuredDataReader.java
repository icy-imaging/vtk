// java wrapper for vtkXMLUnstructuredDataReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLUnstructuredDataReader extends vtkXMLDataReader
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

  private native long GetNumberOfPoints_4();
  public long GetNumberOfPoints()
  {
    return GetNumberOfPoints_4();
  }

  private native long GetNumberOfCells_5();
  public long GetNumberOfCells()
  {
    return GetNumberOfCells_5();
  }

  private native long GetNumberOfPieces_6();
  public long GetNumberOfPieces()
  {
    return GetNumberOfPieces_6();
  }

  private native void SetupUpdateExtent_7(int id0,int id1,int id2);
  public void SetupUpdateExtent(int id0,int id1,int id2)
  {
    SetupUpdateExtent_7(id0,id1,id2);
  }

  private native void CopyOutputInformation_8(vtkInformation id0,int id1);
  public void CopyOutputInformation(vtkInformation id0,int id1)
  {
    CopyOutputInformation_8(id0,id1);
  }

  public vtkXMLUnstructuredDataReader() { super(); }

  public vtkXMLUnstructuredDataReader(long id) { super(id); }

}
