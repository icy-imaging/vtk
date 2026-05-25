// java wrapper for vtkHierarchicalBinningFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHierarchicalBinningFilter extends vtkPolyDataAlgorithm
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

  private native void SetNumberOfLevels_4(int id0);
  public void SetNumberOfLevels(int id0)
  {
    SetNumberOfLevels_4(id0);
  }

  private native int GetNumberOfLevelsMinValue_5();
  public int GetNumberOfLevelsMinValue()
  {
    return GetNumberOfLevelsMinValue_5();
  }

  private native int GetNumberOfLevelsMaxValue_6();
  public int GetNumberOfLevelsMaxValue()
  {
    return GetNumberOfLevelsMaxValue_6();
  }

  private native int GetNumberOfLevels_7();
  public int GetNumberOfLevels()
  {
    return GetNumberOfLevels_7();
  }

  private native void SetAutomatic_8(boolean id0);
  public void SetAutomatic(boolean id0)
  {
    SetAutomatic_8(id0);
  }

  private native boolean GetAutomatic_9();
  public boolean GetAutomatic()
  {
    return GetAutomatic_9();
  }

  private native void AutomaticOn_10();
  public void AutomaticOn()
  {
    AutomaticOn_10();
  }

  private native void AutomaticOff_11();
  public void AutomaticOff()
  {
    AutomaticOff_11();
  }

  private native void SetDivisions_12(int id0,int id1,int id2);
  public void SetDivisions(int id0,int id1,int id2)
  {
    SetDivisions_12(id0,id1,id2);
  }

  private native void SetDivisions_13(int id0[]);
  public void SetDivisions(int id0[])
  {
    SetDivisions_13(id0);
  }

  private native int[] GetDivisions_14();
  public int[] GetDivisions()
  {
    return GetDivisions_14();
  }

  private native void SetBounds_15(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetBounds_15(id0,id1,id2,id3,id4,id5);
  }

  private native void SetBounds_16(double id0[]);
  public void SetBounds(double id0[])
  {
    SetBounds_16(id0);
  }

  private native double[] GetBounds_17();
  public double[] GetBounds()
  {
    return GetBounds_17();
  }

  private native int GetNumberOfGlobalBins_18();
  public int GetNumberOfGlobalBins()
  {
    return GetNumberOfGlobalBins_18();
  }

  private native int GetNumberOfBins_19(int id0);
  public int GetNumberOfBins(int id0)
  {
    return GetNumberOfBins_19(id0);
  }

  private native void GetBinBounds_20(int id0,double id1[]);
  public void GetBinBounds(int id0,double id1[])
  {
    GetBinBounds_20(id0,id1);
  }

  private native void GetLocalBinBounds_21(int id0,int id1,double id2[]);
  public void GetLocalBinBounds(int id0,int id1,double id2[])
  {
    GetLocalBinBounds_21(id0,id1,id2);
  }

  public vtkHierarchicalBinningFilter() { super(); }

  public vtkHierarchicalBinningFilter(long id) { super(id); }
  public native long   VTKInit();

}
