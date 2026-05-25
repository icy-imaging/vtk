// java wrapper for vtkXMLTableReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLTableReader extends vtkXMLReader
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
  public vtkTable GetOutput()
  {
    long temp = GetOutput_4();

    if (temp == 0) return null;
    return (vtkTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetOutput_5(int id0);
  public vtkTable GetOutput(int id0)
  {
    long temp = GetOutput_5(id0);

    if (temp == 0) return null;
    return (vtkTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfRows_6();
  public long GetNumberOfRows()
  {
    return GetNumberOfRows_6();
  }

  private native long GetNumberOfPieces_7();
  public long GetNumberOfPieces()
  {
    return GetNumberOfPieces_7();
  }

  private native void SetupUpdateExtent_8(int id0,int id1);
  public void SetupUpdateExtent(int id0,int id1)
  {
    SetupUpdateExtent_8(id0,id1);
  }

  private native void CopyOutputInformation_9(vtkInformation id0,int id1);
  public void CopyOutputInformation(vtkInformation id0,int id1)
  {
    CopyOutputInformation_9(id0,id1);
  }

  public vtkXMLTableReader() { super(); }

  public vtkXMLTableReader(long id) { super(id); }
  public native long   VTKInit();

}
