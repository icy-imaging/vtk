// java wrapper for vtkXMLDataReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLDataReader extends vtkXMLReader
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

  private native void CopyOutputInformation_6(vtkInformation id0,int id1);
  public void CopyOutputInformation(vtkInformation id0,int id1)
  {
    CopyOutputInformation_6(id0,id1);
  }

  public vtkXMLDataReader() { super(); }

  public vtkXMLDataReader(long id) { super(id); }

}
