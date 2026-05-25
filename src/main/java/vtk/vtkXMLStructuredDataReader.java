// java wrapper for vtkXMLStructuredDataReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLStructuredDataReader extends vtkXMLDataReader
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

  private native void SetWholeSlices_6(int id0);
  public void SetWholeSlices(int id0)
  {
    SetWholeSlices_6(id0);
  }

  private native int GetWholeSlices_7();
  public int GetWholeSlices()
  {
    return GetWholeSlices_7();
  }

  private native void WholeSlicesOn_8();
  public void WholeSlicesOn()
  {
    WholeSlicesOn_8();
  }

  private native void WholeSlicesOff_9();
  public void WholeSlicesOff()
  {
    WholeSlicesOff_9();
  }

  private native void CopyOutputInformation_10(vtkInformation id0,int id1);
  public void CopyOutputInformation(vtkInformation id0,int id1)
  {
    CopyOutputInformation_10(id0,id1);
  }

  public vtkXMLStructuredDataReader() { super(); }

  public vtkXMLStructuredDataReader(long id) { super(id); }

}
