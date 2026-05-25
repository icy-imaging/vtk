// java wrapper for vtkExtractHierarchicalBins object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkExtractHierarchicalBins extends vtkPointCloudFilter
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

  private native void SetLevel_4(int id0);
  public void SetLevel(int id0)
  {
    SetLevel_4(id0);
  }

  private native int GetLevel_5();
  public int GetLevel()
  {
    return GetLevel_5();
  }

  private native void SetBin_6(int id0);
  public void SetBin(int id0)
  {
    SetBin_6(id0);
  }

  private native int GetBin_7();
  public int GetBin()
  {
    return GetBin_7();
  }

  private native void SetBinningFilter_8(vtkHierarchicalBinningFilter id0);
  public void SetBinningFilter(vtkHierarchicalBinningFilter id0)
  {
    SetBinningFilter_8(id0);
  }

  private native long GetBinningFilter_9();
  public vtkHierarchicalBinningFilter GetBinningFilter()
  {
    long temp = GetBinningFilter_9();

    if (temp == 0) return null;
    return (vtkHierarchicalBinningFilter)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkExtractHierarchicalBins() { super(); }

  public vtkExtractHierarchicalBins(long id) { super(id); }
  public native long   VTKInit();

}
