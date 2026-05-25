// java wrapper for vtkXMLFileReadTester object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLFileReadTester extends vtkXMLParser
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

  private native int TestReadFile_4();
  public int TestReadFile()
  {
    return TestReadFile_4();
  }

  private native byte[] GetFileDataType_5();
  public String GetFileDataType()
  {
    return new String(GetFileDataType_5(), StandardCharsets.UTF_8);
  }

  private native byte[] GetFileVersion_6();
  public String GetFileVersion()
  {
    return new String(GetFileVersion_6(), StandardCharsets.UTF_8);
  }

  public vtkXMLFileReadTester() { super(); }

  public vtkXMLFileReadTester(long id) { super(id); }
  public native long   VTKInit();

}
