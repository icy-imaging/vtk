// java wrapper for vtkExodusIIReaderParser object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExodusIIReaderParser extends vtkXMLParser
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

  private native long GetSIL_4();
  public vtkMutableDirectedGraph GetSIL()
  {
    long temp = GetSIL_4();

    if (temp == 0) return null;
    return (vtkMutableDirectedGraph)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Go_5(byte[] id0, int len0);
  public void Go(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    Go_5(bytes0, bytes0.length);
  }

  private native boolean HasInformationAboutBlock_6(int id0);
  public boolean HasInformationAboutBlock(int id0)
  {
    return HasInformationAboutBlock_6(id0);
  }

  private native byte[] GetBlockName_7(int id0);
  public String GetBlockName(int id0)
  {
    return new String(GetBlockName_7(id0), StandardCharsets.UTF_8);
  }

  public vtkExodusIIReaderParser() { super(); }

  public vtkExodusIIReaderParser(long id) { super(id); }
  public native long   VTKInit();

}
