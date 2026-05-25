// java wrapper for vtkXMLCompositeDataSetWriterHelper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLCompositeDataSetWriterHelper extends vtkObject
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

  private native void SetWriter_4(vtkXMLWriterBase id0);
  public void SetWriter(vtkXMLWriterBase id0)
  {
    SetWriter_4(id0);
  }

  private native long GetWriter_5();
  public vtkXMLWriterBase GetWriter()
  {
    long temp = GetWriter_5();

    if (temp == 0) return null;
    return (vtkXMLWriterBase)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] WriteDataSet_6(byte[] id0, int len0,byte[] id1, int len1,vtkDataObject id2);
  public String WriteDataSet(String id0,String id1,vtkDataObject id2)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return new String(WriteDataSet_6(bytes0, bytes0.length,bytes1, bytes1.length,id2), StandardCharsets.UTF_8);
  }

  public vtkXMLCompositeDataSetWriterHelper() { super(); }

  public vtkXMLCompositeDataSetWriterHelper(long id) { super(id); }
  public native long   VTKInit();

}
