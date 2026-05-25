// java wrapper for vtkFDSReader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkFDSReader extends vtkPartitionedDataSetCollectionAlgorithm
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

  private native void SetFileName_4(byte[] id0, int len0);
  public void SetFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetFileName_4(bytes0, bytes0.length);
  }

  private native byte[] GetFileName_5();
  public String GetFileName()
  {
    return new String(GetFileName_5(), StandardCharsets.UTF_8);
  }

  private native void SetStream_6(vtkResourceStream id0);
  public void SetStream(vtkResourceStream id0)
  {
    SetStream_6(id0);
  }

  private native long GetStream_7();
  public vtkResourceStream GetStream()
  {
    long temp = GetStream_7();

    if (temp == 0) return null;
    return (vtkResourceStream)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetAssembly_8();
  public vtkDataAssembly GetAssembly()
  {
    long temp = GetAssembly_8();

    if (temp == 0) return null;
    return (vtkDataAssembly)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native int GetAssemblyTag_9();
  public int GetAssemblyTag()
  {
    return GetAssemblyTag_9();
  }

  private native boolean AddSelector_10(byte[] id0, int len0);
  public boolean AddSelector(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return AddSelector_10(bytes0, bytes0.length);
  }

  private native void ClearSelectors_11();
  public void ClearSelectors()
  {
    ClearSelectors_11();
  }

  private native double GetTimeTolerance_12();
  public double GetTimeTolerance()
  {
    return GetTimeTolerance_12();
  }

  private native void SetTimeTolerance_13(double id0);
  public void SetTimeTolerance(double id0)
  {
    SetTimeTolerance_13(id0);
  }

  public vtkFDSReader() { super(); }

  public vtkFDSReader(long id) { super(id); }
  public native long   VTKInit();

}
