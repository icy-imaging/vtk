// java wrapper for vtkXMLDataWriterHelper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkXMLDataWriterHelper extends vtkXMLWriter
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

  private native void SetWriter_4(vtkXMLWriter2 id0);
  public void SetWriter(vtkXMLWriter2 id0)
  {
    SetWriter_4(id0);
  }

  private native long GetWriter_5();
  public vtkXMLWriter2 GetWriter()
  {
    long temp = GetWriter_5();

    if (temp == 0) return null;
    return (vtkXMLWriter2)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean OpenFile_6();
  public boolean OpenFile()
  {
    return OpenFile_6();
  }

  private native boolean BeginWriting_7();
  public boolean BeginWriting()
  {
    return BeginWriting_7();
  }

  private native boolean EndWriting_8();
  public boolean EndWriting()
  {
    return EndWriting_8();
  }

  private native boolean AddGlobalFieldData_9(vtkCompositeDataSet id0);
  public boolean AddGlobalFieldData(vtkCompositeDataSet id0)
  {
    return AddGlobalFieldData_9(id0);
  }

  private native boolean AddXML_10(vtkXMLDataElement id0);
  public boolean AddXML(vtkXMLDataElement id0)
  {
    return AddXML_10(id0);
  }

  private native void SetDataSetName_11(byte[] id0, int len0);
  public void SetDataSetName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDataSetName_11(bytes0, bytes0.length);
  }

  private native void SetDataSetVersion_12(int id0,int id1);
  public void SetDataSetVersion(int id0,int id1)
  {
    SetDataSetVersion_12(id0,id1);
  }

  private native byte[] GetDefaultFileExtension_13();
  public String GetDefaultFileExtension()
  {
    return new String(GetDefaultFileExtension_13(), StandardCharsets.UTF_8);
  }

  public vtkXMLDataWriterHelper() { super(); }

  public vtkXMLDataWriterHelper(long id) { super(id); }
  public native long   VTKInit();

}
