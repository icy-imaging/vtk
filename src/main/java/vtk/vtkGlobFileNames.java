// java wrapper for vtkGlobFileNames object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkGlobFileNames extends vtkObject
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

  private native void Reset_4();
  public void Reset()
  {
    Reset_4();
  }

  private native void SetDirectory_5(byte[] id0, int len0);
  public void SetDirectory(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDirectory_5(bytes0, bytes0.length);
  }

  private native byte[] GetDirectory_6();
  public String GetDirectory()
  {
    return new String(GetDirectory_6(), StandardCharsets.UTF_8);
  }

  private native int AddFileNames_7(byte[] id0, int len0);
  public int AddFileNames(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return AddFileNames_7(bytes0, bytes0.length);
  }

  private native void SetRecurse_8(int id0);
  public void SetRecurse(int id0)
  {
    SetRecurse_8(id0);
  }

  private native void RecurseOn_9();
  public void RecurseOn()
  {
    RecurseOn_9();
  }

  private native void RecurseOff_10();
  public void RecurseOff()
  {
    RecurseOff_10();
  }

  private native int GetRecurse_11();
  public int GetRecurse()
  {
    return GetRecurse_11();
  }

  private native int GetNumberOfFileNames_12();
  public int GetNumberOfFileNames()
  {
    return GetNumberOfFileNames_12();
  }

  private native byte[] GetNthFileName_13(int id0);
  public String GetNthFileName(int id0)
  {
    return new String(GetNthFileName_13(id0), StandardCharsets.UTF_8);
  }

  private native long GetFileNames_14();
  public vtkStringArray GetFileNames()
  {
    long temp = GetFileNames_14();

    if (temp == 0) return null;
    return (vtkStringArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkGlobFileNames() { super(); }

  public vtkGlobFileNames(long id) { super(id); }
  public native long   VTKInit();

}
